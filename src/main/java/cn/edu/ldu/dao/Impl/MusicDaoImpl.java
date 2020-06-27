package cn.edu.ldu.dao.Impl;

import cn.edu.ldu.dao.MusicDao;
import cn.edu.ldu.entity.Music;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

@Repository
public class MusicDaoImpl implements MusicDao {
    @Resource
    private SessionFactory sessionFactory;
    //所以这里需要setter方法，这里的getter方法顺带添上，如果以后需要获取sessionFactory的话可以调用
    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }
    //依赖注入，需要setter方法
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    @Override
    public void addMusic(String musicname, String username, String context) {
        Music music=new Music(musicname,username,context);
        sessionFactory.getCurrentSession().save(music);
    }

    @Override
    public List<Music> showAllMusic() {
        String hql = "from Music";
        return sessionFactory.getCurrentSession().createQuery(hql).list();
    }

    @Override
    public List<Music> findMusicByUsername(String username) {
        String hql="from Music where username = ?1";
        return sessionFactory.getCurrentSession().createQuery(hql).setParameter(1,username).list();
    }

    @Override
    public void delMusicById(Music music) {
        sessionFactory.getCurrentSession().delete(music);
    }

    @Override
    public Music findMusicById(int id) {
        return (Music)sessionFactory.getCurrentSession().get(Music.class,id);

    }

    @Override
    public List<Music> findMusicByMusicname(String musicname) {
        String hql="from Music where musicname like :name";
        return sessionFactory.getCurrentSession().createQuery(hql).setParameter("name","%" +  musicname+ "%").list();
    }
}

package cn.edu.ldu.dao.Impl;

import cn.edu.ldu.dao.JokeDao;
import cn.edu.ldu.entity.Joke;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

@Repository
public class JokeDaoImpl implements JokeDao {
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
    public void addJoke(String jokename,String context,String username) {
        Joke joke=new Joke(jokename,context,username);
        sessionFactory.getCurrentSession().save(joke);
    }

    @Override
    public List<Joke> showAllJoke() {
        String hql = "from Joke";
        return sessionFactory.getCurrentSession().createQuery(hql).list();
    }

    @Override
    public List<Joke> findByUsername(String username) {
        String hql="from Joke where username =?1";
        return sessionFactory.getCurrentSession().createQuery(hql).setParameter(1,username).list();
    }

    @Override
    public void updateJoke(Joke joke) {
        sessionFactory.getCurrentSession().update(joke);
    }

    @Override
    public void delJokeId(Joke joke) {
        sessionFactory.getCurrentSession().delete(joke);
    }

    @Override
    public Joke findJokeById(int id) {
        return (Joke)sessionFactory.getCurrentSession().get(Joke.class,id);
    }
}

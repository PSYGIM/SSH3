package cn.edu.ldu.dao.Impl;

import cn.edu.ldu.dao.CartoonDao;
import cn.edu.ldu.entity.Cartoon;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;
import javax.annotation.Resource;

import java.util.List;
@Repository
public class CartoonDaoImpl implements CartoonDao {
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
    public void addCartoon(String cartoonname, String username, String context) {
        Cartoon cartoon=new Cartoon(cartoonname,username,context);
        sessionFactory.getCurrentSession().save(cartoon);
    }

    /**
     * 查看全部图片
     * @return
     */
    @Override
    public List<Cartoon> showAllCartoon() {
        String hql = "from Cartoon";
        return sessionFactory.getCurrentSession().createQuery(hql).list();
    }

    @Override
    public List<Cartoon> findCartoonByUsername(String username) {
        String hql="from Cartoon where username = ?1";
        return sessionFactory.getCurrentSession().createQuery(hql).setParameter(1,username).list();
    }

    @Override
    public Cartoon findCartoonById(int id) {
        return (Cartoon) sessionFactory.getCurrentSession().get(Cartoon.class,id);
    }

    @Override
    public void delCartoonById(Cartoon cartoon) {
        sessionFactory.getCurrentSession().delete(cartoon);
    }

    @Override
    public void updateCartoon(Cartoon cartoon) {
        sessionFactory.getCurrentSession().update(cartoon);
    }
}


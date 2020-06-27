package cn.edu.ldu.dao.Impl;

import cn.edu.ldu.dao.LoginActionDao;
import cn.edu.ldu.entity.AdminUser;
import cn.edu.ldu.entity.OrdinaryUser;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

@Repository
public class LoginActionDaoImpl implements LoginActionDao {
    @Resource
    private SessionFactory sessionFactory;
    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    @Override
    public String loginAdmin(String username, String password) {
        String hql="from AdminUser where username=?1 and password=?2";
        List list=  sessionFactory.getCurrentSession().createQuery(hql).setParameter(1,username).setParameter(2,password).list();
        if(list==null){
            return "no_exist";
        }
        return "exist";
    }

    @Override
    public String logintUser(String username, String password) {
        String hql="from OrdinaryUser where username=?1 and password=?2";
        List list=sessionFactory.getCurrentSession().createQuery(hql).setParameter(1,username).setParameter(2,password).list();
        if(list==null){
            return "no_exist";
        }
        return "exist";
    }

    @Override
    public boolean queryAdminByUsername(String username) {
        String hql="from AdminUser where username like :name";
        List list=sessionFactory.getCurrentSession().createQuery(hql).setParameter("name","%" +  username+ "%").list();

        if(list==null){
            return false;
        }
        return true;
    }

    @Override
    public boolean queryUserByUsername(String username) {
        String hql="from OrdinaryUser where username like :name";
        List list=sessionFactory.getCurrentSession().createQuery(hql).setParameter("name","%" +  username+ "%").list();
        if(list==null){
            return false;
        }
        return true;
    }

    @Override
    public List<AdminUser> queryAdmin(String username) {
        String hql="from AdminUser where username like :name";

        return sessionFactory.getCurrentSession().createQuery(hql).setParameter("name","%" +  username+ "%").list();
    }

    @Override
    public List<OrdinaryUser> queryUser(String username) {
        String hql="from OrdinaryUser where username like :name";
        return sessionFactory.getCurrentSession().createQuery(hql).setParameter("name","%" +  username+ "%").list();
    }

}

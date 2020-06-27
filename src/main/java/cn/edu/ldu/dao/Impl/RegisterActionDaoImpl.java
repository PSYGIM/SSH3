package cn.edu.ldu.dao.Impl;

import cn.edu.ldu.dao.AdminActionDao;
import cn.edu.ldu.dao.RegisterActionDao;
import cn.edu.ldu.entity.AdminUser;
import cn.edu.ldu.entity.OrdinaryUser;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;
@Repository
public class RegisterActionDaoImpl implements RegisterActionDao {
    @Resource
    private SessionFactory sessionFactory;
    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }


    @Override
    public void registAdmin(String username, String password, String phone, String role) {
            AdminUser adminUser=new AdminUser();
            adminUser.setUsername(username);
            adminUser.setPassword(password);
            adminUser.setPhone(phone);
            adminUser.setRole(role);
            sessionFactory.getCurrentSession().save(adminUser);


    }

    @Override
    public void registUser(String username, String password, String phone, String role) {
            OrdinaryUser ordinaryUser=new OrdinaryUser();
            ordinaryUser.setUsername(username);
            ordinaryUser.setPassword(password);
            ordinaryUser.setPhone(phone);
            ordinaryUser.setRole(role);
            sessionFactory.getCurrentSession().save(ordinaryUser);
    }

    public boolean queryAdminByUsername(String username){
        String hql="from AdminUser where username like :name";
        List list=sessionFactory.getCurrentSession().createQuery(hql).setParameter("name","%" +  username+ "%").list();
        if(list==null){
            return true;
        }
        return false;

    }

    @Override
    public boolean queryUserByUsername(String username) {
        String hql="from OrdinaryUser where username like :name";
        List list=sessionFactory.getCurrentSession().createQuery(hql).setParameter("name","%" +  username+ "%").list();
        if(list==null){
            return true;
        }
        return false;

}



}

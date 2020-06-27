package cn.edu.ldu.dao.Impl;

import cn.edu.ldu.dao.AdminActionDao;
import cn.edu.ldu.entity.AdminUser;
import cn.edu.ldu.entity.OrdinaryUser;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;
@Repository
public class AdminActionDaoImpl  implements AdminActionDao{
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

    /**
     * 查看全部的普通用户信息
     * @return
     */
    @Override
    public List<OrdinaryUser> showAllUsers() {
        return sessionFactory.getCurrentSession().createQuery("from OrdinaryUser ").list();
    }

    /**
     * 根据普通用户的用户名进行模糊查询
     * @param username
     * @return
     */
    @Override
    public List<OrdinaryUser> queryUserByUsername(String username) {
        String hql="from OrdinaryUser where username like :name";
        return sessionFactory.getCurrentSession().createQuery(hql).setParameter("name","%" +  username+ "%").list();

    }

    @Override
    public OrdinaryUser queryUserById(int id) {
        return sessionFactory.getCurrentSession().get(OrdinaryUser.class,id);
    }

    /**
     * 修改普通用户的账号信息
     * @param ordinaryUser
     */
    @Override
    public void updateUser(OrdinaryUser ordinaryUser) {

        sessionFactory.getCurrentSession().update(ordinaryUser);
    }

    /**
     * 管理员添加普通用户
     * @param ordinaryUser
     */
    @Override
    public void addUser(OrdinaryUser ordinaryUser) {

        sessionFactory.getCurrentSession().update(ordinaryUser);
    }

    /**
     * 通过id删除普通用户账号
     * @param ordinaryUser
     * @return
     */
    @Override
    public void delUserById(OrdinaryUser ordinaryUser) {
        //System.out.println(ordinaryUser);
        sessionFactory.getCurrentSession().delete(ordinaryUser);

    }

    /**
     * 管理员修改自己个人信息
     * @param adminUser
     */
    @Override
    public void updateAdminSelf(AdminUser adminUser) {
        sessionFactory.getCurrentSession().update(adminUser);
    }

}

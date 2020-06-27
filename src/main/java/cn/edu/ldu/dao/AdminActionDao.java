package cn.edu.ldu.dao;

import cn.edu.ldu.entity.AdminUser;
import cn.edu.ldu.entity.OrdinaryUser;

import java.util.List;

public interface AdminActionDao {


    public List<OrdinaryUser> showAllUsers();
    public List<OrdinaryUser> queryUserByUsername(String username);
    public OrdinaryUser queryUserById(int id);
    public void updateUser(OrdinaryUser ordinaryUser);
    public void addUser(OrdinaryUser ordinaryUser);
    public void delUserById(OrdinaryUser ordinaryUser);
    public void  updateAdminSelf(AdminUser adminUser);

}

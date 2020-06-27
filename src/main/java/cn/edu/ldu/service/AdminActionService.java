package cn.edu.ldu.service;

import cn.edu.ldu.entity.AdminUser;
import cn.edu.ldu.entity.OrdinaryUser;

import java.util.List;

public interface AdminActionService {
    public List<OrdinaryUser> showAllUsers();
    public List<OrdinaryUser> queryUserByUsername(String username);
    boolean  updateUser(OrdinaryUser ordinaryUser);
    boolean addUser(OrdinaryUser ordinaryUser);
    boolean  delUserById(int id);
    boolean updateAdminSelf(AdminUser adminUser);
}

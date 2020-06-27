package cn.edu.ldu.dao;


import cn.edu.ldu.entity.AdminUser;
import cn.edu.ldu.entity.OrdinaryUser;

import java.util.List;


public interface RegisterActionDao {
    public void registAdmin(String username, String password, String phone, String role);
    public void registUser(String username, String password, String phone, String role);
    public boolean queryAdminByUsername(String username);
    public boolean queryUserByUsername(String username);

}

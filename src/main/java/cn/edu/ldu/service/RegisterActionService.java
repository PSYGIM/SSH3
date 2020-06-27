package cn.edu.ldu.service;

import cn.edu.ldu.entity.AdminUser;
import cn.edu.ldu.entity.OrdinaryUser;

public interface RegisterActionService {
    public String registAdmin(String username, String password, String phone, String role);
    public String registUser(String username, String password, String phone, String role);

}

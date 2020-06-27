package cn.edu.ldu.service;

import cn.edu.ldu.entity.AdminUser;
import cn.edu.ldu.entity.OrdinaryUser;

public interface LoginActionService {
    public String loginAdmin(String username, String password);
    public String logintUser(String username, String password);

    public AdminUser queryAdmin(String username);
    public OrdinaryUser queryUser(String username);
}

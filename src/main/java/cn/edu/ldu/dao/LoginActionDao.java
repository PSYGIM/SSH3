package cn.edu.ldu.dao;

import cn.edu.ldu.action.AdminAction;
import cn.edu.ldu.entity.AdminUser;
import cn.edu.ldu.entity.OrdinaryUser;
import org.hibernate.query.Query;

import java.util.List;

public interface LoginActionDao {
    public String loginAdmin(String username, String password);
    public String logintUser(String username, String password);
    public boolean queryAdminByUsername(String username);
    public boolean queryUserByUsername(String username);
    public List<AdminUser> queryAdmin(String username);
    public List<OrdinaryUser> queryUser(String username);

}

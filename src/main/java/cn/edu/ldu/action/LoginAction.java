package cn.edu.ldu.action;

import cn.edu.ldu.entity.AdminUser;
import cn.edu.ldu.entity.OrdinaryUser;
import cn.edu.ldu.service.LoginActionService;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.interceptor.SessionAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Map;

@Controller
@Transactional(readOnly=true)
public class LoginAction extends ActionSupport implements SessionAware {
    private String username;
    private String password;
    private String phone;
    private String role;
    private Map<String,Object> session;
    @Autowired
    private LoginActionService loginActionService;
    public String login(){
        //System.out.println("username="+this.getUsername()+",password="+this.getPassword()+"，phone="+this.getPhone()+",role="+this.getRole());
        if (this.getRole().equals("mgr")){
            String flag=loginActionService.loginAdmin(username,password);
            if (flag.equals("0")){
                System.out.println("该管理员用户不存在");
                return "input";
            }
            else if(flag.equals("1")){
              AdminUser user=loginActionService.queryAdmin(username);

                session.put("username",this.getUsername());
                session.put("password",this.getPassword());
                session.put("phone",user.getPhone());
                session.put("id",user.getId());
                session.put("role",this.getRole());
                System.out.println("管理员登录成功");
                return "admin_login_success";
            }else {
                System.out.println("密码不正确");
                return "admin_login_error";
            }

        }else {
            String flag=loginActionService.logintUser(username,password);
            if (flag.equals("0")){
                System.out.println("该用户不存在");
                return "input";
            }
            else if(flag.equals("1")){
                OrdinaryUser user=loginActionService.queryUser(username);
                session.put("username",this.getUsername());
                session.put("password",this.getPassword());
                session.put("phone",user.getPhone());
                session.put("role",this.getRole());
                System.out.println("用户登录成功");
                return "ordianry_login_success";
            }else {
                System.out.println("用户密码不正确");
                return "ordianry_login_error";
            }
        }

    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public LoginActionService getLoginActionService() {
        return loginActionService;
    }

    public void setLoginActionService(LoginActionService loginActionService) {
        this.loginActionService = loginActionService;
    }


    @Override
    public void setSession(Map<String, Object> session) {
        this.session=session;
    }
}

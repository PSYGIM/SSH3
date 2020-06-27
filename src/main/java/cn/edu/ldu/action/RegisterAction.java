package cn.edu.ldu.action;

import cn.edu.ldu.entity.AdminUser;
import cn.edu.ldu.service.RegisterActionService;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.interceptor.SessionAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;

import java.util.Map;

@Controller("registerAction")
@Transactional(readOnly=true)
public class RegisterAction extends ActionSupport implements SessionAware {
    private String username;
    private String password;
    private String phone;
    private String role;
    private Map<String,Object> session;

    @Autowired
    private RegisterActionService registerActionService;

    public String regist() throws Exception{
        System.out.println("username="+this.getUsername()+",password="+this.getPassword()+"，phone="+this.getPhone()+",role="+this.getRole());
        if (this.getRole().equals("mgr")){
           String flag=registerActionService.registAdmin(this.getUsername(),this.getPassword(),this.getPhone(),this.getRole());
           if (flag.equals("0")){
               System.out.println("该管理员用户名已存在");
               return "admin_regist_error";
           }else {

               session.put("username",this.getUsername());
               session.put("password",this.getPassword());
               session.put("phone",this.getPhone());
               session.put("role",this.getRole());
               return "admin_regist_success";
           }

        }
        else {

            String flag=registerActionService.registUser(this.username,this.password,this.phone,this.role);
            if (flag.equals("0")){
                System.out.println("该用户的用户名已存在");
                return "ordianry_regist_error";
            }else {
                session.put("username",this.getUsername());
                session.put("password",this.getPassword());
                session.put("phone",this.getPhone());
                session.put("role",this.getRole());
                return "ordianry_regist_success";
            }

        }

    }




    //  注入Service，我们需要保留set方法
    public void setRegisterActionService(RegisterActionService registerActionService) {
        this.registerActionService = registerActionService;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
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
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public void setSession(Map<String, Object> session) {
        this.session=session;
    }
}

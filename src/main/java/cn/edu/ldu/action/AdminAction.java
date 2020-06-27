package cn.edu.ldu.action;

import cn.edu.ldu.entity.AdminUser;
import cn.edu.ldu.entity.OrdinaryUser;
import cn.edu.ldu.service.AdminActionService;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.interceptor.SessionAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller("/adminAction")
@Scope("prototype")/*每执行一次，创建一个action*/
public class AdminAction extends ActionSupport implements SessionAware {
    @Autowired
    private AdminActionService  adminActionService;
    private OrdinaryUser ordinaryUser;
    private AdminUser adminUser;
    private Map<String,Object> session;
    private ArrayList<OrdinaryUser> userList;

    /**
     * 管理员修改自己个人信息
     * @return
     */
    public  String updateSelf(){

        boolean b=adminActionService.updateAdminSelf(adminUser);
        if(b){
            System.out.println("管理员修改个人修改账号成功！");
            return "updateSelfSuccess";
        }else {
            System.out.println("管理员修改个人账号失败！");
            return "updateSelfError";
        }
    }
    /**
     *管理员查看全部用户信息
     * @return
     */
    public String selectAllUsersAccount(){
        List<OrdinaryUser> userList=adminActionService.showAllUsers();
//        System.out.println(userList);
        session.put("usersession",userList);
        return "selectAllUserSuccess";
    }

       /**
     * 管理员根据用户名进行模糊查询
     * @return
     */
    public String selectUsersByUsername(){
        List<OrdinaryUser> userList=adminActionService.queryUserByUsername(ordinaryUser.getUsername());
//        System.out.println(userList);
        session.put("usersession",userList);
        return "selectUsersByUsernameSuccess";
    }

    /**
     * 管理员修改用户信息
     * @return
     */
    public String updateUserAccount(){
       // System.out.println("username="+ordinaryUser.getUsername()+",password="+ordinaryUser.getPassword()+"，phone="+ordinaryUser.getPhone()+",role="+ordinaryUser.getRole());
        boolean b=adminActionService.updateUser(ordinaryUser);
        if(b){
            System.out.println("修改用户账号成功！");
            return "updateUserSuccess";
        }else {
            System.out.println("修改用户账号失败！");
            return "updateUserError";
        }
    }

    /**
     * 管理员根据id删除用户信息
     * @return
     */
    public String deleteUserAccountById(){
        boolean b=adminActionService.delUserById(ordinaryUser.getId());
        if(b){
            System.out.println("删除用户成功！");
            return "deleteAccountByIdSuccess";
        }else {
            System.out.println("删除用户失败！");
            return "deleteAccountByIdError";
        }
    }

    /**
     * 添加用户账号
     * @return
     */
    public String addUserAccount(){
        //System.out.println("username="+ordinaryUser.getUsername()+",password="+ordinaryUser.getPassword()+"，phone="+ordinaryUser.getPhone()+",role="+ordinaryUser.getRole());
        boolean b=adminActionService.addUser(ordinaryUser);
        if(b){
            System.out.println("添加用户成功！");
            return "addAccountSuccess";
        }else {
            System.out.println("添加用户失败！");
            return "addAccountError";
        }
    }



    public AdminActionService getAdminActionService() {
        return adminActionService;
    }

    public void setAdminActionService(AdminActionService adminActionService) {
        this.adminActionService = adminActionService;
    }

    public OrdinaryUser getOrdinaryUser() {
        return ordinaryUser;
    }

    public void setOrdinaryUser(OrdinaryUser ordinaryUser) {
        this.ordinaryUser = ordinaryUser;
    }

    public Map<String, Object> getSession() {
        return session;
    }

    public AdminUser getAdminUser() {
        return adminUser;
    }

    public void setAdminUser(AdminUser adminUser) {
        this.adminUser = adminUser;
    }

    @Override
    public void setSession(Map<String, Object> session) {
        this.session = session;
    }
}

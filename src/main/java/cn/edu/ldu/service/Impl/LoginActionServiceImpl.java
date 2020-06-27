package cn.edu.ldu.service.Impl;

import cn.edu.ldu.dao.LoginActionDao;
import cn.edu.ldu.entity.AdminUser;
import cn.edu.ldu.entity.OrdinaryUser;
import cn.edu.ldu.service.LoginActionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginActionServiceImpl  implements LoginActionService {
    @Autowired
    private LoginActionDao loginActionDao;

    public LoginActionDao getLoginActionDao() {
        return loginActionDao;
    }

    public void setLoginActionDao(LoginActionDao loginActionDao) {
        this.loginActionDao = loginActionDao;
    }

    @Override
    public String loginAdmin(String username, String password) {
        String flag=loginActionDao.loginAdmin(username,password);
        boolean b=loginActionDao.queryAdminByUsername(username);
        if(b){
            if(flag.equals("exist")){
                return "1";
            }else {
                return "2";
            }
        }else {
            return "0";
        }



    }

    @Override
    public String logintUser(String username, String password) {
        String flag=loginActionDao.logintUser(username,password);
        boolean b=loginActionDao.queryUserByUsername(username);
        if(b){
            if(flag.equals("exist")){
                return "1";/*登录成功*/
            }else {
                return "2";/*密码错误*/
            }
        }
        else  {
            return "0";/*账号不存在*/
        }
    }

    @Override
    public AdminUser queryAdmin(String username) {

        return  loginActionDao.queryAdmin(username).get(0);
    }

    @Override
    public OrdinaryUser queryUser(String username) {

        return loginActionDao.queryUser(username).get(0);

    }


}

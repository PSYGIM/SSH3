package cn.edu.ldu.service.Impl;

import cn.edu.ldu.dao.RegisterActionDao;
import cn.edu.ldu.entity.AdminUser;
import cn.edu.ldu.entity.OrdinaryUser;
import cn.edu.ldu.service.RegisterActionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegisterActionServiceImpl  implements RegisterActionService {

    @Autowired
    private RegisterActionDao registerActionDao;

    public RegisterActionDao getRegisterActionDao() {
        return registerActionDao;
    }

    public void setRegisterActionDao(RegisterActionDao registerActionDao) {
        this.registerActionDao = registerActionDao;
    }

    @Override
    public String registAdmin(String username, String password, String phone, String role) {
        boolean b = registerActionDao.queryAdminByUsername(username);
        if (b) {
            return "0";
        } else {
            registerActionDao.registAdmin(username, password, phone, role);
            return "1";
        }

    }

    @Override
    public String registUser(String username, String password, String phone, String role) {
        boolean b = registerActionDao.queryUserByUsername(username);
        if (b) {
            return "0";
        } else {
            registerActionDao.registUser(username, password, phone, role);
            return "1";
        }

    }


}

package cn.edu.ldu.service.Impl;

import cn.edu.ldu.dao.AdminActionDao;
import cn.edu.ldu.entity.AdminUser;
import cn.edu.ldu.entity.OrdinaryUser;
import cn.edu.ldu.service.AdminActionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class AdminActionServiceImpl implements AdminActionService {
    @Resource
    private AdminActionDao adminActionDao;
    public AdminActionDao getAdminActionDao() {
        return adminActionDao;
    }

    public void setAdminActionDao(AdminActionDao adminActionDao) {
        this.adminActionDao = adminActionDao;
    }

    @Override
    public List<OrdinaryUser> showAllUsers() {
       return adminActionDao.showAllUsers();

    }

    @Override
    public  List<OrdinaryUser> queryUserByUsername(String username) {

        return adminActionDao.queryUserByUsername(username);
    }


    @Override
    public boolean updateUser(OrdinaryUser ordinaryUser) {

        adminActionDao.updateUser(ordinaryUser);
        return true;
    }

    @Override
    public boolean addUser(OrdinaryUser ordinaryUser) {
            adminActionDao.addUser(ordinaryUser);
            return true;
    }

    @Override
    public boolean delUserById(int id) {

        OrdinaryUser ordinaryUser=adminActionDao.queryUserById(id);
        adminActionDao.delUserById(ordinaryUser);
        return true;
    }

    @Override
    public boolean updateAdminSelf(AdminUser adminUser) {
        adminActionDao.updateAdminSelf(adminUser);
        return true;
    }
}

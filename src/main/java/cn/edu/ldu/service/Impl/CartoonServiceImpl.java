package cn.edu.ldu.service.Impl;

import cn.edu.ldu.dao.CartoonDao;
import cn.edu.ldu.entity.Cartoon;
import cn.edu.ldu.service.CartoonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartoonServiceImpl implements CartoonService {
    @Autowired
    private CartoonDao cartoonDao;

    public CartoonDao getCartoonDao() {
        return cartoonDao;
    }

    public void setCartoonDao(CartoonDao cartoonDao) {
        this.cartoonDao = cartoonDao;
    }
    @Override
    public void addCartoon(String cartoonname, String username, String context) {
        cartoonDao.addCartoon(cartoonname,username,context);
    }

    @Override
    public List<Cartoon> showAllCartoon() {
        return cartoonDao.showAllCartoon();
    }

    @Override
    public List<Cartoon>findCaroonByUsername(String username) {
        return cartoonDao.findCartoonByUsername(username);
    }

    @Override
    public Cartoon findCartoonById(int id) {
        return cartoonDao.findCartoonById(id);
    }

    @Override
    public boolean delCartoonById(int id) {
        Cartoon cartoon = cartoonDao.findCartoonById(id);
        cartoonDao.delCartoonById(cartoon);
        return true;
    }

    @Override
    public boolean updateCartoon(Cartoon cartoon) {
        cartoonDao.updateCartoon(cartoon);
        return true;
    }
}

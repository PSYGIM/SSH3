package cn.edu.ldu.service;

import cn.edu.ldu.entity.Cartoon;

import java.util.List;

public interface CartoonService {
    public void addCartoon(String cartoonname,String username,String context);
    public List<Cartoon> showAllCartoon();
    public List<Cartoon> findCaroonByUsername(String username);
    public Cartoon findCartoonById(int id);
    public boolean delCartoonById(int id);
    public boolean updateCartoon(Cartoon cartoon);
}

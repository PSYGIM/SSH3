package cn.edu.ldu.dao;


import cn.edu.ldu.entity.Cartoon;

import java.util.List;

public interface CartoonDao {
   public void addCartoon(String cartoonname,String username,String context);
   public List<Cartoon> showAllCartoon();
   public List<Cartoon> findCartoonByUsername(String username);
   public Cartoon findCartoonById(int id);
   public void delCartoonById(Cartoon cartoon);
   public void updateCartoon(Cartoon cartoon);
}

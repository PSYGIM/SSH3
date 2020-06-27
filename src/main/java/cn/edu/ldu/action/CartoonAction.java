package cn.edu.ldu.action;


import cn.edu.ldu.entity.Cartoon;
import cn.edu.ldu.entity.OrdinaryUser;
import cn.edu.ldu.service.CartoonService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.interceptor.annotations.Before;
import org.apache.struts2.interceptor.SessionAware;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;

import org.springframework.transaction.annotation.Transactional;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;


@Controller("CartoonAction")
@Transactional(readOnly = true)
public class CartoonAction extends ActionSupport implements SessionAware {
    @Autowired
    private CartoonService cartoonService;

    private String cartoonname;
    private String username;
    private String context;
    private int id;
    private Cartoon cartoon;
    private List<Cartoon> cartoonlist = new ArrayList<Cartoon>();
    private List<Cartoon> usernamecartoonlist = new ArrayList<Cartoon>();

    /**
     * 添加漫画
     * @return
     */
    public String addCartoon() {
        cartoonService.addCartoon(this.cartoonname,this.username,this.context);
        return SUCCESS;
    }

    /**
     * 显示所有漫画
     * @return
     */
    public String showAllCartoon(){
        cartoonlist = cartoonService.showAllCartoon();
        session.put("cartoonSession", this.cartoonlist);
        return SUCCESS;
    }

    /**
     * 根据id查找漫画
     * @return
     */
    public String findCartoonById(){
        Cartoon findCartoonById = cartoonService.findCartoonById(this.id);
        session.put("findCartoonById",findCartoonById);
        return SUCCESS;
    }

    /**
     * 根据id删除漫画
     * @return
     */
    public String delCartoonById(){
        boolean b = cartoonService.delCartoonById(id);
        if(b){
            System.out.println("漫画删除成功");
            return "success";
        }else {
            System.out.println("漫画删除失败");
            return "error";
        }
    }

    /**
     * 通过用户名查找漫画
     * @return
     */
    public String findCartoonByUsername(){
        String username = (String)session.get("username");
        usernamecartoonlist = cartoonService.findCaroonByUsername(username);
        session.put("ucartoonSession",this.usernamecartoonlist);
        return SUCCESS;
    }
    public String updateCartoonById(){
        boolean b = cartoonService.updateCartoon(cartoon);
        if (b) {
            System.out.println("漫画修改成功");
            return "success";
        } else {
            System.out.println("漫画修改失败");
            return "error";
        }
    }

    public String getCartoonname() {
        return cartoonname;
    }

    public void setCartoonname(String cartoonname) {
        this.cartoonname = cartoonname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public void setCartoonService(CartoonService cartoonService) {
        this.cartoonService = cartoonService;
    }
    public CartoonAction() {
        super();
    }

    public Cartoon getCartoon() {
        return cartoon;
    }

    public void setCartoon(Cartoon cartoon) {
        this.cartoon = cartoon;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private Map<String,Object> session;
    public void setSession(Map<String, Object> session) {
        this.session = session;
    }
}

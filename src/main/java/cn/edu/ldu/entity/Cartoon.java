package cn.edu.ldu.entity;

import javax.persistence.*;
@Entity
public class Cartoon {
    private int id;
    private String cartoonname;
    private String context;
    private String username;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCartoonname() {
        return cartoonname;
    }

    public void setCartoonname(String cartoonname) {
        this.cartoonname = cartoonname;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    public Cartoon() {
    }
    public Cartoon(String cartoonname,String username,String context){
        this.cartoonname = cartoonname;
        this.username = username;
        this.context = context;
    }
}


package cn.edu.ldu.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Joke {
    private String jokename;
    private String context;
    private String username;
    private int id;



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getJokename() {
        return jokename;
    }

    public void setJokename(String jokename) {
        this.jokename = jokename;
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
    public Joke(){};
    public Joke(String jokename,String context,String username){
        this.jokename = jokename;
        this.context = context;
        this.username = username;
    }
}
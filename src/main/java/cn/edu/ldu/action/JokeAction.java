package cn.edu.ldu.action;

import cn.edu.ldu.entity.Joke;
import cn.edu.ldu.service.JokeService;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.interceptor.SessionAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller("JokeAction")
@Transactional(readOnly = true)
public class JokeAction extends ActionSupport implements SessionAware {
    private String jokename;
    private String context;
    private String username;
    private int id;
    private Joke joke;
    private List<Joke> jokelist = new ArrayList<Joke>();
    private List<Joke> usernamejokelist = new ArrayList<Joke>();
    @Autowired
    private JokeService jokeService;

    /**
     * 添加笑话
     * @return
     */
    public String addJoke(){
        jokeService.addJoke(this.jokename,this.context,this.username);
        return SUCCESS;
    }

    /**
     * 显示所有笑话
     * @return
     */
    public String showAllJoke(){
        jokelist = jokeService.showAllJoke();
        session.put("jokeSession", this.jokelist);
        return SUCCESS;
    }

    /**
     * 根据用户名查找笑话
     * @return
     */
    public String findJokeByUsername(){
        String username = (String)session.get("username");
        usernamejokelist = jokeService.findByUsername(username);
        session.put("ujokeSession",this.usernamejokelist);
        return SUCCESS;
    }

    /**
     * 根据id查找笑话
     * @return
     */
    public String findJokeById(){
        Joke findJokeById = jokeService.findJokeById(this.id);
        session.put("findJokeById",findJokeById);
        return SUCCESS;
    }

    /**
     * 根据id修改笑话
     * @return
     */
    public String updateJokeById() {
        boolean b = jokeService.updateJoke(joke);
        if (b) {
            System.out.println("笑话修改成功");
            return "success";
        } else {
            System.out.println("笑话修改失败");
            return "error";
        }
    }

    /**
     * 根据id删除用户
     * @return
     */
    public String delJokeById(){
        boolean b = jokeService.delJokeId(id);
        if(b){
            System.out.println("笑话删除成功");
            return "success";
        }else {
            System.out.println("笑话删除失败");
            return "error";
        }
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setJokeService(JokeService jokeService) {
        this.jokeService = jokeService;
    }
    private Map<String,Object> session;
    public void setSession(Map<String, Object> session) {
        this.session = session;
    }

    public Joke getJoke() {
        return joke;
    }

    public void setJoke(Joke joke) {
        this.joke = joke;
    }
}

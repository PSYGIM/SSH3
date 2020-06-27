package cn.edu.ldu.action;

import cn.edu.ldu.entity.Music;
import cn.edu.ldu.service.MusicService;
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
public class MusicAction extends ActionSupport implements SessionAware {
    private String musicname;
    private String context;
    private String username;
    private int id;
    private Music music;
    private List<Music> musiclist = new ArrayList<Music>();
    private List<Music> querymusiclist = new ArrayList<Music>();
    private List<Music> usernamemusiclist = new ArrayList<Music>();
    @Autowired
    private MusicService musicService;

    /**
     * 添加音乐
     * @return
     */
    public String addMusic(){
        musicService.addMusic(this.musicname,this.context,this.username);
        return SUCCESS;
    }

    /**
     * 显示所有音乐
     * @return
     */
    public String showAllMusic(){
        musiclist = musicService.showAllMusic();
        session.put("musicSession",this.musiclist);
        return SUCCESS;
    }

    /**
     * 通过id查找音乐
     * @return
     */
    public String findMusicById(){
        Music findMusicById = musicService.findMusicById(this.id);
        session.put("findMusicById",findMusicById);
        return SUCCESS;
    }

    /**
     * 通过id删除音乐
     * @return
     */
    public String delMusicById(){
        boolean b = musicService.delMusicId(this.id);
        return SUCCESS;
    }

    /**
     * 通过音乐名查找音乐
     * @return
     */
    public String findMusicByMusicname(){
        querymusiclist = musicService.findMusicByMusicname(this.musicname);
        session.put("querysession",this.querymusiclist);
        return SUCCESS;
    }

    /**
     * 通过用户名查找音乐
     * @return
     */public String findMusicByusername(){
        String username = (String)session.get("username");
        usernamemusiclist = musicService.findMusicByUsername(username);
        session.put("umusicSession",this.usernamemusiclist);
        return SUCCESS;
    }
    public String getMusicname() {
        return musicname;
    }

    public void setMusicname(String musicname) {
        this.musicname = musicname;
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

    public Music getMusic() {
        return music;
    }

    public void setMusic(Music music) {
        this.music = music;
    }
    private Map<String,Object> session;
    public void setSession(Map<String, Object> session) {
        this.session = session;
    }

    public MusicService getMusicService() {
        return musicService;
    }

    public void setMusicService(MusicService musicService) {
        this.musicService = musicService;
    }
}

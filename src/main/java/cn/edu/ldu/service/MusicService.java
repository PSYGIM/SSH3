package cn.edu.ldu.service;

import cn.edu.ldu.entity.Music;

import java.util.List;

public interface MusicService {
    public void addMusic(String musicname,String username,String context);
    public List<Music> showAllMusic();
    public List<Music> findMusicByUsername(String username);
    public Music findMusicById(int id);
    public boolean delMusicId(int id);
    public List<Music> findMusicByMusicname(String musicname);
}

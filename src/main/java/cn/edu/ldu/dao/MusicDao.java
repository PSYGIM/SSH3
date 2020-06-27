package cn.edu.ldu.dao;

import cn.edu.ldu.entity.Music;

import java.util.List;

public interface MusicDao {
    public void addMusic(String musicname,String username,String context);
    public List<Music> showAllMusic();
    public List<Music> findMusicByUsername(String username);
    public void delMusicById(Music music);
    public Music findMusicById(int id);
    public List<Music> findMusicByMusicname(String musicname);
}

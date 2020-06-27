package cn.edu.ldu.service.Impl;

import cn.edu.ldu.dao.MusicDao;
import cn.edu.ldu.entity.Music;
import cn.edu.ldu.service.MusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MusicServiceImpl implements MusicService {
    @Autowired
    private MusicDao musicDao;

    public MusicDao getMusicDao() {
        return musicDao;
    }

    public void setMusicDao(MusicDao musicDao) {
        this.musicDao = musicDao;
    }

    @Override
    public void addMusic(String musicname, String username, String context) {
        musicDao.addMusic(musicname,username,context);
    }

    @Override
    public List<Music> showAllMusic() {
        return musicDao.showAllMusic();
    }

    @Override
    public List<Music> findMusicByUsername(String username) {
        return musicDao.findMusicByUsername(username);
    }

    @Override
    public Music findMusicById(int id) {
        return musicDao.findMusicById(id);
    }

    @Override
    public boolean delMusicId(int id) {
        Music music = musicDao.findMusicById(id);
        musicDao.delMusicById(music);
        return true;
    }

    @Override
    public List<Music> findMusicByMusicname(String musicname) {
        return musicDao.findMusicByMusicname(musicname);
    }
}

package cn.edu.ldu.service.Impl;

import cn.edu.ldu.dao.JokeDao;
import cn.edu.ldu.entity.Joke;
import cn.edu.ldu.service.JokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JokeServiceImpl implements JokeService {
    @Autowired
    private JokeDao jokeDao;

    public JokeDao getJokeDao() {
        return jokeDao;
    }

    public void setJokeDao(JokeDao jokeDao) {
        this.jokeDao = jokeDao;
    }

    @Override
    public void addJoke(String jokename, String context, String username) {
        jokeDao.addJoke(jokename,context,username);
    }

    @Override
    public List<Joke> showAllJoke() {
        return jokeDao.showAllJoke();
    }

    @Override
    public List<Joke> findByUsername(String username) {
        return jokeDao.findByUsername(username);
    }

    @Override
    public Joke findJokeById(int id) {
        return jokeDao.findJokeById(id);
    }

    @Override
    public boolean updateJoke(Joke joke) {
        jokeDao.updateJoke(joke);
        return true;
    }

    @Override
    public boolean delJokeId(int id) {
        Joke joke = jokeDao.findJokeById(id);
        jokeDao.delJokeId(joke);
        return true;
    }
}

package cn.edu.ldu.dao;

import cn.edu.ldu.entity.Cartoon;
import cn.edu.ldu.entity.Joke;

import java.util.List;

public interface JokeDao {
    public void addJoke(String jokename,String context,String username);
    public List<Joke> showAllJoke();
    public List<Joke> findByUsername(String username);
    public void updateJoke(Joke joke);
    public void delJokeId(Joke joke);
    public Joke findJokeById(int id);
}

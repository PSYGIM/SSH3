package cn.edu.ldu.service;

import cn.edu.ldu.entity.Joke;

import java.util.List;

public interface JokeService {
    public void addJoke(String jokename,String context,String username);
    public List<Joke> showAllJoke();
    public List<Joke> findByUsername(String username);
    public Joke findJokeById(int id);
    public boolean updateJoke(Joke joke);
    public boolean delJokeId(int id);
}

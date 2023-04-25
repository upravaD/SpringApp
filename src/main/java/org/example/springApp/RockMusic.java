package org.example.springApp;

import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Random;

@Component("musicRock")
public class RockMusic implements Music {
    private final List<String> songs = List.of("RockSong1", "RockSong2", "RockSong3");

    @Override
    public String getSong() {
        return songs.get(new Random().nextInt(songs.size()));
    }

    @Override
    public void init() {
        System.out.println("Initialization bean " + this.getClass().getSimpleName() + " complete!");
        TestSpring.COUNT++;
    }
    @Override
    public void destroy() {
        System.out.println("Destruction " + this.getClass().getSimpleName() + " complete!");
    }
    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}
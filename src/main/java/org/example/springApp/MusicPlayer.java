package org.example.springApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class MusicPlayer {
    private Music classicalMusic;
    private Music rockMusic;
    private Music rapMusic;
    private String name;
    private int volume;

    public MusicPlayer() {
    }
    @Autowired
    public MusicPlayer(@Qualifier("musicClassic") Music classicalMusic,
                       @Qualifier("musicRock") Music rockMusic,
                       @Qualifier("musicRap") Music rapMusic) {
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
        this.rapMusic = rapMusic;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getVolume() {
        return volume;
    }
    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void playMusic(Genre genre) {
        switch (genre) {
            case RAP -> System.out.println("Playing: " + rapMusic.getSong());
            case ROCK -> System.out.println("Playing: " + rockMusic.getSong());
            case CLASSICAL -> System.out.println("Playing: " + classicalMusic.getSong());
        }
    }
}

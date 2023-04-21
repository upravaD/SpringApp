package org.example.springApp;

public class ClassicalMusic implements Music {
    private String song;

    public ClassicalMusic() {
    }

    public static ClassicalMusic getClassicFactory() {
        return new ClassicalMusic();
    }

    public void init() {
        System.out.println("Initialization " + ClassicalMusic.class.getSimpleName() + " complete!");
        TestSpring.COUNT++;
    }

    public void destroy() {
        System.out.println("Destruction " + ClassicalMusic.class.getSimpleName() + " complete!");
    }

    @Override
    public String getSong() {
        return song;
    }

    public void setSong(String song) {
        this.song = song;
    }

    @Override
    public String toString() {
        return getSong();
    }
}

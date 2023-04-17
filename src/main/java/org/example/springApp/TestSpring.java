package org.example.springApp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");

        Music musicBean = context.getBean("musicBean", Music.class);
        MusicPlayer musicPlayer = new MusicPlayer(musicBean);
        musicPlayer.playMusic();

        context.close();
    }
}

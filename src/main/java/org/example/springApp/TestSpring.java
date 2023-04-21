package org.example.springApp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Random;

public class TestSpring {
    public static int COUNT = 0;

    public static void main(String[] args) {

        // Создание ApplicationContext из файла xml
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");

        // Создание бинов MusicPlayer через ApplicationContext
        MusicPlayer firstMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        MusicPlayer secondMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        boolean equalsResult = firstMusicPlayer == secondMusicPlayer;

        // Сравнение бинов MusicPlayer
        System.out.println("=".repeat(50));
        System.out.println("equalsResult = " + equalsResult + " {");
        System.out.println("firstMusicPlayer = " + firstMusicPlayer);
        System.out.println("secondMusicPlayer = " + secondMusicPlayer);
        System.out.println("}");

        // Изменение полей класса MusicPlayer
        System.out.println("=".repeat(50));
        firstMusicPlayer.setVolume(10);
        secondMusicPlayer.setName("upravaD");
        System.out.println("firstMusicPlayer: { " + "name = " + firstMusicPlayer.getName() + "; volume = " + firstMusicPlayer.getVolume() + " }");
        System.out.println("secondMusicPlayer: { " + "name = " + secondMusicPlayer.getName() + "; volume = " + secondMusicPlayer.getVolume() + " }");

        // Считаем количество вызовов метода init класса ClassicalMusic
        System.out.println("=".repeat(50));
        for (int i = 0; i < new Random().nextInt(5); i++) {
            context.getBean("musicClassic", ClassicalMusic.class);
            context.getBean("musicRock", RockMusic.class);
            context.getBean("musicRap", RapMusic.class);
        }
        System.out.println("COUNT_INIT = " + COUNT);

        // Закрытие ApplicationContext
        System.out.println("=".repeat(50));
        context.close();

    }
}

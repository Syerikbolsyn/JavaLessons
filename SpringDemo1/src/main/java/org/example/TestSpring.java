package org.example;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        TestBean testBean = context.getBean("testBean", TestBean.class);
        System.out.println(testBean.getName());
//        Music music = context.getBean("musicBean", Music.class);
//        MusicPlayer musicPlayer = new MusicPlayer(music);
        MusicPlayer firstmusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        MusicPlayer secondmusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        boolean comp = firstmusicPlayer == secondmusicPlayer;
        firstmusicPlayer.playMusic();
        secondmusicPlayer.setVolume(31);
        System.out.println(firstmusicPlayer.getName());
        System.out.println(firstmusicPlayer.getVolume());
        System.out.println(secondmusicPlayer.getVolume());
        System.out.println(comp);
        ClassicalMusic classicalMusic = context.getBean("musicBean1", ClassicalMusic.class);
        System.out.println(classicalMusic.getSong());
        OneMusicPlayer oneMusicPlayer = context.getBean("oneMusicPlayer", OneMusicPlayer.class);
        oneMusicPlayer.playOneMusic();
        System.out.println("@volume " +oneMusicPlayer.getVolume());
        System.out.println("   ");
        Computer computer = context.getBean("computer", Computer.class);
        System.out.println(computer.toString());
        ManyMusicPlayer manyMusicPlayer = context.getBean("manyMusicPlayer", ManyMusicPlayer.class);
        System.out.println(manyMusicPlayer.playManyMusic(AllPopMusics.QPOP));
        context.close();

    }
}

package org.example;

import org.springframework.beans.factory.annotation.Value;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class JmusicPlayer {
    List<Music> musics = new ArrayList<>();
//    JclassicalMusic jclassicalMusic;
//    JRockMusic jRockMusic;
    @Value("${musicPlayer.name}")
    private String name;

    private int volume;
    public JmusicPlayer(List<Music> musics) {
        this.musics = musics;
    }

    public String jmusicPlay() {
        Random rand = new Random();
        return "Playing " + musics.get(rand.nextInt(3)).getSong() +  " on " + name + " volume " + volume;
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}

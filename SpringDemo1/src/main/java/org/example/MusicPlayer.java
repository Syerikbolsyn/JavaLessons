package org.example;

import java.util.ArrayList;
import java.util.*;

public class MusicPlayer {
    private List<Music> musicList = new ArrayList<>();

    public void setName(String name) { this.name = name; }

    public void setVolume(int volume) { this.volume = volume; }

    private String name;
    private int volume;
    public String getName() { return name; }
    public int getVolume() { return volume; }
    public MusicPlayer(List<Music> musics) { this.musicList = musics; }
    public void setMusic(List<Music> musics) { this.musicList = musics; }
    public MusicPlayer(){}
    public void playMusic() {
        for (Music music : musicList) {
            System.out.println("Playing: " + music.getSong()); }
    }
}

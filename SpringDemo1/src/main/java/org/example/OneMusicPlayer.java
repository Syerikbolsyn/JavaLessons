package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class OneMusicPlayer {
    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;
    private RockMusic qpop;
    private PopMusic popMusic;
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
    @Autowired
    public OneMusicPlayer( RockMusic qpop, PopMusic popMusic) {
        this.qpop = qpop;
        this.popMusic = popMusic;
    }
    public String playOneMusic() {
        return "playing one music: " + qpop.getSong() +" and playing one music: " + popMusic.getSong();
    }
}

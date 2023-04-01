package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Computer {
    private int id;
    private OneMusicPlayer oneMusicPlayer;
    @Autowired
    public Computer(OneMusicPlayer oneMusicPlayer) {
        this.id = 1;
        this.oneMusicPlayer = oneMusicPlayer;
    }
    @Override
    public String toString() {
        return "Computer " + id + oneMusicPlayer.playOneMusic();
    }

}

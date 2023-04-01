package org.example;

import org.springframework.beans.factory.annotation.Autowired;

public class JComputer {
    private int id;
    private JmusicPlayer jmusicPlayer;

    public JComputer(JmusicPlayer jmusicPlayer) {
        this.id = 1;
        this.jmusicPlayer = jmusicPlayer;
    }
    @Override
    public String toString() {
        return "Java Computer " + id + " " + jmusicPlayer.jmusicPlay();
    }
}

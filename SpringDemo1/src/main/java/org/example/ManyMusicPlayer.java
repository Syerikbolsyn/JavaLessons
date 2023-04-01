package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Random;
@Component
public class ManyMusicPlayer   {
        private Qpop qpop;
        private KpopMusic kpopMusic;
        @Autowired
        public ManyMusicPlayer( Qpop qpop, KpopMusic kpopMusic) {
            this.qpop = qpop;
            this.kpopMusic = kpopMusic;
        }

        public String playManyMusic(AllPopMusics allPopMusics) {
            Random rand = new Random();
            if (allPopMusics.equals(AllPopMusics.KPOP)) {
                return kpopMusic.getSongs().get(rand.nextInt(3));
            } else {
                return qpop.getSongs().get(rand.nextInt(3));
            }
        }
}

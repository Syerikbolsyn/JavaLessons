package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.Arrays;
import java.util.List;

@Configuration
//@ComponentScan("org.example")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {
    @Bean
    public  JclassicalMusic jclassicalMusic() {
        return JclassicalMusic.getJclassicMusic();
    }
    @Bean
    public JRockMusic jRockMusic() {
        return new JRockMusic();
    }
    @Bean
    public JmusicPlayer jmusicPlayer(){
        return new JmusicPlayer(musicList());
    }
    @Bean
    public List<Music> musicList() {
        return Arrays.asList(jqPop(), jclassicalMusic(), jRockMusic());

    }

    @Bean
    public JComputer jComputer() {
        return new JComputer(jmusicPlayer());
    }
    @Bean
    public JQPop jqPop() {
        return new JQPop();
    }

}

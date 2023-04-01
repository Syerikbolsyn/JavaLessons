package org.example;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class JRockMusic implements Music{
    @Override
    public String getSong(){
        return "Wind cries Mary";
    }
    @PostConstruct
    public void doMyInit() {
        System.out.println("Doing my initalization JRock");
    }
    @PreDestroy
    public void doDestroy(){
        System.out.println("Destroying method JRoock");
    }
}

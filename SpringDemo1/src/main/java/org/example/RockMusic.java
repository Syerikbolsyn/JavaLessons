package org.example;

import org.springframework.context.annotation.*;
import org.springframework.stereotype.Component;
import javax.annotation.*;

@Component("musicBean2")
@Scope("singleton")
public class RockMusic implements Music{
    @Override
    public String getSong(){
        return "Wind cries Mary";
    }
    @PostConstruct
    public void doMyInit() {
        System.out.println("Doing my initalization Rock");
    }
    @PreDestroy
    public void doDestroy(){
        System.out.println("Destroying method Roock");
    }
}

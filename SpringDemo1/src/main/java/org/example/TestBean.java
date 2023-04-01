package org.example;

import org.springframework.stereotype.Component;

public class TestBean {
    private String name;
    public TestBean(String name) {
        this.name = name;
    }
    public String getName(){
        return name;
    }
//    public String setName(String name) {
//        this.name = name;
//    }
}

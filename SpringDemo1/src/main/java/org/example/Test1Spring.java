package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test1Spring {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                SpringConfig.class
        );
        JclassicalMusic jclassicalMusic = context.getBean("jclassicalMusic", JclassicalMusic.class);
        System.out.println(jclassicalMusic.getSong());
        JComputer jComputer = context.getBean("jComputer", JComputer.class);
        System.out.println(jComputer.toString());
        context.close();
    }
}

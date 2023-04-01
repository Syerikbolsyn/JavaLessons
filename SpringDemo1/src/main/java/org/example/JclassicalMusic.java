package org.example;

public class JclassicalMusic implements Music{
    private JclassicalMusic() {};
    public static JclassicalMusic getJclassicMusic() {
        return new JclassicalMusic();
    }
    public void doMyInit() {
        System.out.println("Doing my initalization");
    }
    public void doDestroy(){
        System.out.println("Destroying method");
    }
    @Override
    public String getSong() {
        return "New Jclassic Music";
    }

}

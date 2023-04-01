package org.example;

public class ClassicalMusic implements Music{
    private ClassicalMusic() {};
    public static ClassicalMusic getClassicMusic() {
        return new ClassicalMusic();
    }
    public void doMyInit() {
        System.out.println("Doing my initalization");
    }
    public void doDestroy(){
        System.out.println("Destroying method");
    }
    @Override
    public String getSong() {
        return "Classic Music";
    }
}

import java.lang.*;
import java.util.*;
public class Test {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(13);
        arrayList.add(232);
        for (int i = 0; i < 11; i++) {
            arrayList.add(i * 8+ 21);
        }
        System.out.println(arrayList);
        System.out.println(arrayList.get(12));
        System.out.println(arrayList.get(2));
        System.out.println(arrayList.size());
        arrayList.remove(2);

        System.out.println(arrayList.get(2));
        System.out.println(arrayList.size());
//        MyThread myThread = new MyThread();
//        myThread.start();

        System.out.println("Hello Thread 3");
        System.out.println("Hello Thread 2");
        System.out.println("Hello Thread 1");
        MyThread myThread1 = new MyThread();
        myThread1.start();
//        Thread thread = new Thread(new Runner());
//        thread.start();
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        myThread1.shutDown();

    }
}
class Runner implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            try{
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Hello " + i);
        }
    }

}
class MyThread extends Thread {
    private volatile
    boolean running = true;
    @Override
    public void run() {
        while (running) {
            try{
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Hello " );
        }
    }
    public void shutDown() {
        this.running = false;
    }
}


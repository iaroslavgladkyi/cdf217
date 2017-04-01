package plf.threads;

/**
 * Created by codefire on 26.03.17.
 */
public class Demo {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Open");
        Dan dan = new Dan();
        Thread thread = new Thread(dan);
        thread.start();
        thread.join();
        System.out.println("HelloWorld");
    }
}
class Dan implements Runnable {
    public void run() {
        for (int i = 1; i <= 10000000; i++)
        {
            try {
                System.out.println(i);
                Thread.sleep(0);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Boom");
    }
}





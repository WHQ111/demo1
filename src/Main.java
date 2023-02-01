import java.sql.SQLOutput;

public class Main {
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        thread1();
        System.out.println("Hello world!");
    }

    public static void thread1() {
        for (int i = 0; i < 10; i++) {
            Thread t1 = new Thread(() -> {
                System.out.println("当前线程： " + Thread.currentThread().getName());
            });
            t1.start();
        }
    }
}
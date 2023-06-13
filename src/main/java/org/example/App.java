package org.example;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws InterruptedException {
//        var thread = Thread.currentThread();
//        System.out.println("Hello Current Thread: " + thread.getName());
//        //Nova Thread
//        Thread thread1 = new Thread(new MeuRunnable());
//        thread1.start();
//
//        Thread thread2 = new Thread(new MeuRunnable());
//        thread2.start();


        //



        Runnable runnable = new MeuRunnable();

        new Thread(runnable).start();
        new Thread(runnable).start();
        new Thread(runnable).start();
        new Thread(runnable).start();
        new Thread(runnable).start();

//        for (int i = 0; i < 1000000; i++) {
//            new Thread(() -> {
//                System.out.println(Thread.currentThread().getName());
//                try {
//                    Thread.sleep(1500000);
//                    System.exit(1);
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
//            }).start();
//        }

//        Thread threadLambda = new Thread(() -> System.out.println("Criando com lambda"));
    }
}

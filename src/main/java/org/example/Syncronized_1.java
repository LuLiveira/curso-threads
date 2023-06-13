package org.example;

public class Syncronized_1 {

    static int i = -1;

    public static void main(String[] args) {

        var meuRunnable = new MeuRunnable();
        new Thread(meuRunnable).start();
        new Thread(meuRunnable).start();
        new Thread(meuRunnable).start();
        new Thread(meuRunnable).start();
        new Thread(meuRunnable).start();

    }

    public static class MeuRunnable implements Runnable {
        @Override
        public void run() {
            i++;
            System.out.println(Thread.currentThread().getName() + ":" + i);
        }
    }
}

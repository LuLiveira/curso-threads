package org.example;

public class MeuRunnable implements Runnable {
    static int i = 0;

    @Override
    public void run() {
        i++;
        System.out.println("O valor de 'i' é: " + i + " e a Thread é: " + Thread.currentThread().getName());
    }
}

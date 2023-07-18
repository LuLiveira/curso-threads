package org.example;

// import java.util.concurrent.atomic.AtomicBoolean;
// import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

public class ClassesAtomicas {
    
    static AtomicInteger i = new AtomicInteger(-1);
    static AtomicLong atomicLong = new AtomicLong(-1);

    // static AtomicReference<Object> atomicReference = new AtomicReference<>(new Object());
    // static AtomicBoolean atomicBoolean = new AtomicBoolean(false );
    // static Number atomicInteger = new AtomicInteger(-1);
    // static Number atomicLong = new AtomicLong(-1);


    public static void main(String[] args) throws Exception {
        new Thread(new MeuRunnable()).start();
        new Thread(new MeuRunnable()).start();
        new Thread(new MeuRunnable()).start();
    }

    static class MeuRunnable implements Runnable {

        @Override
        public void run() {
            String name = Thread.currentThread().getName();
            System.out.println(name + ":" + i.incrementAndGet());
        }
    }
}

package org.example;

public class SyncronizedConsciente {

    static int i = 0;
    public static void main(String[] args) {

        Runnable runnable = () -> {
            int j;

            synchronized (SyncronizedConsciente.class) {
                i++;
                j = i * 2;
            }

            double jElevadoA100 = Math.pow(j, 100);
            double raizQuadradaDeJ = Math.sqrt(jElevadoA100);

            System.out.println(raizQuadradaDeJ);
        };

        new Thread(runnable).start();
        new Thread(runnable).start();
        new Thread(runnable).start();
        new Thread(runnable).start();
        new Thread(runnable).start();
    }
}

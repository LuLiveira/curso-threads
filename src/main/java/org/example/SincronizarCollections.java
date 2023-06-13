package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class SincronizarCollections {

    static List<String> lista = new ArrayList<>();
    //static List<String> lista = Collections.synchronizedList(Collections.EMPTY_LIST);
    public static void main(String[] args) throws InterruptedException {

        lista = Collections.synchronizedList(lista);
//        Collections.synchronizedCollection(Collections.EMPTY_LIST);
//        Collections.synchronizedMap(Collections.EMPTY_MAP);
//        Collections.synchronizedSet(Collections.EMPTY_SET);
//        ...

        Runnable meuRunnable = () -> {
            lista.add("Teste");
        };

        new Thread(meuRunnable).start();
        new Thread(meuRunnable).start();
        new Thread(meuRunnable).start();

        Thread.sleep(500);

        System.out.println(lista);
    }
}

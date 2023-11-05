package org.example.concurrency;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class PrintInOrder1114Test {

    @Test
    void testPrintOrder() throws InterruptedException {

        PrintInOrder1114 printInOrder1114 = new PrintInOrder1114();

        String firstPrint = "first";
        String secondPrint = "second";
        String thirdPrint = "third";

        List<String> printList = new ArrayList<>();

        Thread thread1 = new Thread(() -> {
            try {
                printInOrder1114.first(() -> printList.add(firstPrint));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        Thread thread2 = new Thread(() -> {
            try {
                printInOrder1114.second(() -> printList.add(secondPrint));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        Thread thread3 = new Thread(() -> {
            try {
                printInOrder1114.third(() -> printList.add(thirdPrint));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        thread3.start();
        thread1.start();
        thread2.start();

        thread3.join();

        Assertions.assertEquals(firstPrint, printList.get(0));
        Assertions.assertEquals(secondPrint, printList.get(1));
        Assertions.assertEquals(thirdPrint, printList.get(2));
    }

}


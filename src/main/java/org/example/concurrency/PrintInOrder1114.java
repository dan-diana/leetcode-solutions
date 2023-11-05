package org.example.concurrency;

import java.util.concurrent.CountDownLatch;

public class PrintInOrder1114 {

    private final CountDownLatch firstLatch = new CountDownLatch(1);
    private final CountDownLatch secondLockLatch = new CountDownLatch(1);

    public void first(Runnable printFirst) throws InterruptedException {
        printFirst.run();
        firstLatch.countDown();
    }

    public void second(Runnable printSecond) throws InterruptedException {
        firstLatch.await();
        printSecond.run();
        secondLockLatch.countDown();
    }

    public void third(Runnable printThird) throws InterruptedException {
        secondLockLatch.await();
        printThird.run();
    }
}

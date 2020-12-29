package learn_concurrency.condition_and_lock.third_example;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class SharedObject {

    private Lock lock = new ReentrantLock();

    private int counter = 0;

    private Map<String, String> syncHashMap = new HashMap<>();

    private ReadWriteLock lockTwo = new ReentrantReadWriteLock();

    private Lock writeLock = lockTwo.writeLock();

    private Lock readLock = lockTwo.readLock();

    public void perform() {
        lock.lock();
        try {
            counter++;
        } finally {
            lock.unlock();
        }
    }

    public void performTryLock() throws InterruptedException {
        boolean isLockAcquired = lock.tryLock(1, TimeUnit.SECONDS);
        if (isLockAcquired) {
            try {
            } finally {
                lock.unlock();
            }
        }
    }

    public void put(String key, String value) {
        try {
            writeLock.lock();
            syncHashMap.put(key, value);
        } finally {
            writeLock.unlock();
        }
    }

    public String remove(String key) {
        try {
            writeLock.lock();
            return syncHashMap.remove(key);
        } finally {
            writeLock.unlock();
        }
    }

    public String get(String key) {
        try {
            readLock.lock();
            return syncHashMap.get(key);
        } finally {
            readLock.unlock();
        }
    }

    public boolean containsKey(String key) {
        try {
            readLock.lock();
            return syncHashMap.containsKey(key);
        } finally {
            readLock.unlock();
        }
    }
}

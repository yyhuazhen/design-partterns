package org.example;

public class ThreadSafeLazySingleton {
    private static ThreadSafeLazySingleton threadSafeLazySingleton;

    private ThreadSafeLazySingleton() {
    }

    private static synchronized ThreadSafeLazySingleton getInstance() {
        if (threadSafeLazySingleton == null) {
            threadSafeLazySingleton = new ThreadSafeLazySingleton();
        }
        return threadSafeLazySingleton;
    }
}

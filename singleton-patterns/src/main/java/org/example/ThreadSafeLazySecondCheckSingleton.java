package org.example;

public class ThreadSafeLazySecondCheckSingleton {
    private static volatile ThreadSafeLazySecondCheckSingleton threadSafeLazySecondCheckSingleton;

    private ThreadSafeLazySecondCheckSingleton() {
    }

    private static ThreadSafeLazySecondCheckSingleton getInstance() {
        if (threadSafeLazySecondCheckSingleton == null) {
            synchronized (ThreadSafeLazySecondCheckSingleton.class) {
                if (threadSafeLazySecondCheckSingleton == null) {
                    threadSafeLazySecondCheckSingleton = new ThreadSafeLazySecondCheckSingleton();
                }
            }
        }
        return threadSafeLazySecondCheckSingleton;
    }
}

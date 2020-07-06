package org.example;

/*
 * 赖汉式 忽略线程安全性问题
 * */
public class SimpleLazySingleton {
    private static SimpleLazySingleton simpleLazySingleton;

    private SimpleLazySingleton() {
    }

    public static SimpleLazySingleton getInstance() {
        if (simpleLazySingleton == null) {
            simpleLazySingleton = new SimpleLazySingleton();
        }
        return simpleLazySingleton;
    }
}

package org.example;

/*
 * 饿汉式
 * */
public class HungrySingleton {
    private static HungrySingleton hungrySingleton = new HungrySingleton();

    private HungrySingleton() {
    }

    private HungrySingleton getInstance() {
        System.out.println("我是饿汉式单例");
        return hungrySingleton;
    }
}

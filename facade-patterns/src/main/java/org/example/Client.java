package org.example;

/**
 * Hello world!
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Facade facade = new Facade();
        facade.test();
    }
}

package org.example;

public class InnerClassLazySingleton {
    private InnerClassLazySingleton() {
    }

    public static class Inner {
        private static InnerClassLazySingleton innerClassLazySingleton = new InnerClassLazySingleton();
    }

    public static InnerClassLazySingleton getInstance() {
        return InnerClassLazySingleton.Inner.innerClassLazySingleton;
    }
}

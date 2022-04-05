package com.example.creationalpattern.singletonpattern;

// Classical Java implementation of singleton
// design pattern
// This is not Thread-Safe.
public class LazySingleton {

    private static LazySingleton obj;

    // private constructor to force use of
    // getInstance() to create Singleton object
    private LazySingleton() {}

    public static LazySingleton getInstance()
    {
        if (obj==null)
            obj = new LazySingleton();
        return obj;
    }
}

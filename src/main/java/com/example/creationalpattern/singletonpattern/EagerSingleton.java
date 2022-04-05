package com.example.creationalpattern.singletonpattern;

// Classical Java implementation of singleton
// design pattern
// This is not Thread-Safe.
public class EagerSingleton {

    // private constructor to force use of
    // getInstance() to create Singleton object
    private static EagerSingleton obj = new EagerSingleton();

    private EagerSingleton() {}

    public static EagerSingleton getInstance()
    {
        return obj;
    }
}

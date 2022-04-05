package com.example.creationalpattern.singletonpattern;

// Thread Synchronized Java implementation of
// singleton design pattern
public class ThreadSafeSingleton {

    private static ThreadSafeSingleton obj;

    private ThreadSafeSingleton() {}

    // Only one thread can execute this at a time
    public static synchronized ThreadSafeSingleton getInstance()
    {
        if (obj==null)
            obj = new ThreadSafeSingleton();
        return obj;
    }

}

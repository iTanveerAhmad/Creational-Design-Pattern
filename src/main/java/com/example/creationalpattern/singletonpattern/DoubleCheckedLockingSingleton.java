package com.example.creationalpattern.singletonpattern;

// Double Checked Locking based Java implementation of
// singleton design pattern
public class DoubleCheckedLockingSingleton {

    private static volatile DoubleCheckedLockingSingleton obj  = null;

    private DoubleCheckedLockingSingleton() {}

    public static DoubleCheckedLockingSingleton getInstance()
    {
        if (obj == null)
        {
            // To make thread safe
            synchronized (DoubleCheckedLockingSingleton.class)
            {
                // check again as multiple threads
                // can reach above step
                if (obj==null)
                    obj = new DoubleCheckedLockingSingleton();
            }
        }
        return obj;
    }

}

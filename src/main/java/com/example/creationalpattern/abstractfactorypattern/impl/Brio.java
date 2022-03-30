package com.example.creationalpattern.abstractfactorypattern.impl;

import com.example.creationalpattern.abstractfactorypattern.interfaces.Car;

public class Brio implements Car {
    @Override
    public void drive() {
        System.out.println("Driving Brio...");
    }
}

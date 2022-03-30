package com.example.creationalpattern.abstractfactorypattern.impl;

import com.example.creationalpattern.abstractfactorypattern.interfaces.Car;
import com.example.creationalpattern.abstractfactorypattern.interfaces.CarFactory;

public class HyundaiCarFactory implements CarFactory {
    @Override
    public Car createCar(String carType) {

        if(carType.equals("I10")){
            return new I10();
        }else if(carType.equals("I20")){
            return new I20();
        }
        return null;
    }
}

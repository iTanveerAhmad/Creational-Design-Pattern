package com.example.creationalpattern.abstractfactorypattern.impl;

import com.example.creationalpattern.abstractfactorypattern.interfaces.Car;
import com.example.creationalpattern.abstractfactorypattern.interfaces.CarFactory;

public class HondaCarFactory implements CarFactory {
    @Override
    public Car createCar(String carType) {

        if(carType.equals("city")){
            return new City();
        }else if(carType.equals("brio")) {
            return new Brio();
        }
        return null;
    }
}

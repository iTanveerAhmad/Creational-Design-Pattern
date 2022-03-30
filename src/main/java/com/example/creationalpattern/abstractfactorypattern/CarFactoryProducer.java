package com.example.creationalpattern.abstractfactorypattern;

import com.example.creationalpattern.abstractfactorypattern.impl.HondaCarFactory;
import com.example.creationalpattern.abstractfactorypattern.impl.HyundaiCarFactory;
import com.example.creationalpattern.abstractfactorypattern.interfaces.CarFactory;

public class CarFactoryProducer {

    public static CarFactory getCarFactory(String factoryType){

        if(factoryType.equals("Honda")){
            return new HondaCarFactory();
        }else if(factoryType.equals("Hyundai")){
            return new HyundaiCarFactory();
        }
        return null;
    }
}

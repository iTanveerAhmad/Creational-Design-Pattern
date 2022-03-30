package com.example.creationalpattern;

import com.example.creationalpattern.abstractfactorypattern.CarFactoryProducer;
import com.example.creationalpattern.abstractfactorypattern.impl.City;
import com.example.creationalpattern.abstractfactorypattern.impl.HondaCarFactory;
import com.example.creationalpattern.abstractfactorypattern.interfaces.Car;
import com.example.creationalpattern.abstractfactorypattern.interfaces.CarFactory;
import com.example.creationalpattern.factorypattern.MobileFactory;
import com.example.creationalpattern.factorypattern.interfaces.Mobile;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CreationalpatternApplication {

	public static void main(String[] args) {
		SpringApplication.run(CreationalpatternApplication.class, args);

		// FACTORY PATTERN
		Mobile mobile = MobileFactory.getMobile(Mobile.IPHONE);

		// ABSTRACT FACTORY PATTERN
		CarFactory hondaFactory = CarFactoryProducer.getCarFactory("Honda");
		if(hondaFactory != null) {
			Car city = hondaFactory.createCar("city");
			city.drive();

			Car brio = hondaFactory.createCar("brio");
			brio.drive();
		}

		CarFactory hyundaiFactory = CarFactoryProducer.getCarFactory("Hyundai");
		if(hyundaiFactory != null) {
			Car i10 = hyundaiFactory.createCar("I10");
			i10.drive();

			Car i20 = hyundaiFactory.createCar("I20");
			i20.drive();
		}
	}

}

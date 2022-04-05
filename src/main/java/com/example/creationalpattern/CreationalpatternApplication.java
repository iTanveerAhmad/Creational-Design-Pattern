package com.example.creationalpattern;

import com.example.creationalpattern.abstractfactorypattern.CarFactoryProducer;
import com.example.creationalpattern.abstractfactorypattern.interfaces.Car;
import com.example.creationalpattern.abstractfactorypattern.interfaces.CarFactory;
import com.example.creationalpattern.factorypattern.MobileFactory;
import com.example.creationalpattern.factorypattern.interfaces.Mobile;
import com.example.creationalpattern.singletonpattern.DoubleCheckedLockingSingleton;
import com.example.creationalpattern.singletonpattern.EagerSingleton;
import com.example.creationalpattern.singletonpattern.LazySingleton;
import com.example.creationalpattern.singletonpattern.ThreadSafeSingleton;
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

		// Singleton Design Pattern
		// Eager Initialization
		EagerSingleton eagerSingleton = EagerSingleton.getInstance();
		EagerSingleton eagerSingleton1 = EagerSingleton.getInstance();
		System.out.println("Eager Instance: "+eagerSingleton.hashCode()+", Instance1: "+eagerSingleton1.hashCode());

		LazySingleton lazySingleton = LazySingleton.getInstance();
		LazySingleton lazySingleton1 = LazySingleton.getInstance();
		System.out.println("Lazy Instance: "+lazySingleton.hashCode()+", Instance1: "+lazySingleton1.hashCode());

		ThreadSafeSingleton threadSafeSingleton = ThreadSafeSingleton.getInstance();
		ThreadSafeSingleton threadSafeSingleton1 = ThreadSafeSingleton.getInstance();
		System.out.println("Thread-Safe Instance: "+threadSafeSingleton.hashCode()+", Instance1: "+threadSafeSingleton1.hashCode());

		DoubleCheckedLockingSingleton doubleCheckedLockingSingleton = DoubleCheckedLockingSingleton.getInstance();
		DoubleCheckedLockingSingleton doubleCheckedLockingSingleton1 = DoubleCheckedLockingSingleton.getInstance();
		System.out.println("DoubleCheckedLocking Instance: "+doubleCheckedLockingSingleton.hashCode()+", Instance1: "+doubleCheckedLockingSingleton1.hashCode());


	}

}

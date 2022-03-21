package com.example.creationalpattern;

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

	}

}

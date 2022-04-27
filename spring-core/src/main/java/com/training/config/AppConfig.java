package com.training.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.training.spring.Car;
import com.training.spring.Person;


@Configuration
public class AppConfig {
		
		@Bean("person")
		public Person getPerson() {
			
			Person p = new Person(34);
			p.setFirstName("Mark");
			return p;
		}
		
		@Bean("car")
		public Car getCar() {
			Car c = new Car();
			c.setMake("Mercedes");
			c.setModel("Benz");
			c.setYear("2015");
			return c;
		}
	}



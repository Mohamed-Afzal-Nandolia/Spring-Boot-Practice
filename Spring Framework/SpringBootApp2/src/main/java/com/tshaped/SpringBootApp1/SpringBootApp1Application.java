package com.tshaped.SpringBootApp1;

import com.tshaped.SpringBootApp1.service.Greeting;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


@SpringBootApplication
public class SpringBootApp1Application {

	public static void main(String[] args) {

		ConfigurableApplicationContext container = SpringApplication.run(SpringBootApp1Application.class, args);
		Greeting greet = container.getBean(Greeting.class);
		System.out.println(greet.generateWish());
		/*
		* TimeConfig Bean Created
		* Greeting Bean Created --> Constructor
	    * Good Afternoon
		* */
	}

}

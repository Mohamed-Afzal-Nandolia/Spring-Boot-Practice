package com.tshaped.SpringBootApp1;

import com.tshaped.SpringBootApp1.services.TShapedSkills;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


@SpringBootApplication
public class SpringBootApp1Application {

	public static void main(String[] args) {

		ConfigurableApplicationContext container = SpringApplication.run(SpringBootApp1Application.class, args);
		TShapedSkills tshape = container.getBean(TShapedSkills.class);
		boolean status = tshape.buyTheCourse(4554.4);
		if (status)
			System.out.println("Course purchased");
		else
			System.out.println("Failed to buy the course");

	}

}

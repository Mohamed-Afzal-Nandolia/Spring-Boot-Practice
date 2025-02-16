package com.tshaped.SpringBootApp1;

import com.tshaped.SpringBootApp1.service.Greeting;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/*
* 1. @SpringBootApplication -> @ComponentScan + @EnableAutoConfiguration
*
* Here if we introduce a new local variable, or SpringApplication.run(SpringBootApp1Application.class, args)
* Return type is ConfigurableApplicationContext which is an interface
* */
@SpringBootApplication
public class SpringBootApp1Application {

	public static void main(String[] args) {

		/*
		* Default IOC Container Spring Boot uses is ApplicationContext
		* Internally,
		* public interface ConfigurableApplicationContext extends ApplicationContext, Lifecycle, Closeable{}
		*
		* it extends to ApplicationContext
		* */
		ConfigurableApplicationContext container = SpringApplication.run(SpringBootApp1Application.class, args);

		/*
		* Spring Boot behind the scenes creates 52 beans to support AutoConfiguration
		* here 52 + 1, 1 is the @Service that we created.
		* */
		System.out.println("Bean Count: " + container.getBeanDefinitionCount());
		/* However I got Bean Count: 56 i.e. 55 + 1 */


		Greeting greet = container.getBean(Greeting.class);
		System.out.println(greet.generateWish());
	}

}

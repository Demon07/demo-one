package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Bt21Application {

	@Autowired
	ApplicationContext context;
	
	@Bean
	public CommandLineRunner runner() {
		return (args) -> {
			int count = context.getBeanDefinitionCount();
	        System.out.println("Beans的个数：" + count);
	        String[] names = context.getBeanDefinitionNames();
	        for (String name : names) {
	        		System.out.printf("%s -> %s\n", name, context.getBean(name));
	        }
		};
	}
		
	
		
	
	public static void main(String[] args) {
		/*SpringApplication.run(Bt2Application.class, args);*/
		/*ApplicationContext context = SpringApplication.run(Bt21Application.class, args);
        int count = context.getBeanDefinitionCount();
        System.out.println("Beans的个数：" + count);
        String[] names = context.getBeanDefinitionNames();
        for (String name : names) {
               System.out.print(name);
               System.out.print("->");
               Object bean = context.getBean(name);
               System.out.println(bean.getClass().getName());
        }*/
	}
}
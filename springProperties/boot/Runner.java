package com.xworkz.springProperties.boot;

import java.util.Arrays;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.springProperties.bean.Engine;
import com.xworkz.springProperties.bean.Ghost;
import com.xworkz.springProperties.bean.NewsPaper;
import com.xworkz.springProperties.bean.Snake;
import com.xworkz.springProperties.configuration.SpringConfiguration;

public class Runner {
public static void main(String[] args) {
		
		ApplicationContext container = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		System.out.println(Arrays.toString(container.getBeanDefinitionNames()));
		System.out.println(container.getBeanDefinitionCount());
		
		System.out.println("enter the NewsPaper details");
		
		NewsPaper refOfNews = container.getBean(NewsPaper.class);
		System.out.println(refOfNews.getId());
		System.out.println(refOfNews.getLanguage());
		System.out.println(refOfNews.getName());
		System.out.println(refOfNews.getOwnerName());
		System.out.println(refOfNews.getPrice());
		
		System.out.println("enter the Engine details");

		Engine refOfEngine = container.getBean(Engine.class);
		System.out.println(refOfEngine.getCompany());
		System.out.println(refOfEngine.getName());
		System.out.println(refOfEngine.getNumber());
		System.out.println(refOfEngine.getStrokes());
		System.out.println(refOfEngine.getType());
		System.out.println(refOfEngine.getVersion());
		
		System.out.println("enetr the Snake");
		
		Snake snake = container.getBean(Snake.class);
		System.out.println(snake);
		
		System.out.println("enter the Ghost");
		
		Ghost ghost = container.getBean(Ghost.class);
		System.out.println(ghost);
	}



}

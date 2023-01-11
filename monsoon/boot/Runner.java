package com.xworkz.monsoon.boot;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.monsoon.Configuration.SpringConfiguration;
import com.xworkz.monsoon.bean.Actor;
import com.xworkz.monsoon.bean.Rocket;
import com.xworkz.monsoon.bean.Season;



public class Runner {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		Rocket rocket = context.getBean("rocket", Rocket.class);
		System.out.println(rocket);
		System.out.println(rocket.getCountry());
		System.out.println(rocket.getName());
		System.out.println(rocket.getPrice());
		System.out.println(rocket.toString());
		
		Rocket pslv = context.getBean("pslv", Rocket.class);
		System.out.println(pslv.toString());
		
		System.out.println("enter season");
		
		Season season = context.getBean("season", Season.class);
		System.out.println(season.toString());
		
		Season summer = context.getBean("summer", Season.class);
		System.out.println(summer.toString());
		
		System.out.println("enter summer");

		Actor actor = context.getBean("darshan",Actor.class);
		System.out.println(actor.toString());
	}
}



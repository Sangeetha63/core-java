package com.xworkz.monsoon.Configuration;

import java.time.Month;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.xworkz.monsoon.bean.Actor;
import com.xworkz.monsoon.bean.Rocket;
import com.xworkz.monsoon.bean.Season;

@Configuration
@ComponentScan("com.xworkz.monsoon")
public class SpringConfiguration {
	
	public SpringConfiguration() {
		System.out.println("Created SpringConfiguration....");
	}
	
	@Bean("pslv")
	public Rocket rocket() {
		System.out.println("rocket ");
		Rocket rocket = new Rocket("india", "PSLV", 1423555724);
		System.out.println(rocket.toString());
		return rocket;
	}
	
	@Bean("summer")
	public Season season() {
		System.out.println("season ");
		Season season = new Season("summer", 5, Month.MARCH);
		System.out.println(season.toString());
		return season;
	}
	
	@Bean("darshan")
	public Actor actor() {
		System.out.println("actor ");
		Actor actor = new Actor();
		actor.setName("Darshan");
		actor.setLanguage("Kannada");
		actor.setAge(50);
		return actor;
	}
}




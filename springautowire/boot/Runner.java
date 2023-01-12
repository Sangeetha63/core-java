package com.xworkz.springautowire.boot;

import java.awt.Container;
import java.util.Arrays;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.springautowire.bean.BookShop;
import com.xworkz.springautowire.bean.HardwareShop;
import com.xworkz.springautowire.bean.Pencil;
import com.xworkz.springautowire.bean.Rubber;
import com.xworkz.springautowire.bean.Software;

import com.xworkz.springautowire.configuration.AutowireConfiguration;


public class Runner {
	public static void main(String[] args)  {

		ApplicationContext ApplicationContext = new AnnotationConfigApplicationContext(AutowireConfiguration.class);
		String[] ref = ApplicationContext.getBeanDefinitionNames();
		System.out.println(Arrays.toString(ref));

		HardwareShop hardwareShop = ApplicationContext.getBean (" hardwareShop",HardwareShop.class);
		System.out.println(hardwareShop);

		Software software = ApplicationContext.getBean(Software.class);
		System.out.println(software.toString());

		Pencil pencil = ApplicationContext.getBean(Pencil.class);
		System.out.println(pencil.toString());
		
		BookShop book=ApplicationContext.getBean(BookShop.class);
		System.out.println(book);
		
		
		Rubber rubber=ApplicationContext.getBean(Rubber.class);
		System.out.println(rubber.toString());
		
		

	}

}




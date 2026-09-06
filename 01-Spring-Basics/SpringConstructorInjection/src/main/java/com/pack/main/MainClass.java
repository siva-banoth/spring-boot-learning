package com.pack.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pack.MovieLister;

public class MainClass {
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		
		MovieLister bean = context.getBean(MovieLister.class);
		bean.showMovies(2024);
	}
}

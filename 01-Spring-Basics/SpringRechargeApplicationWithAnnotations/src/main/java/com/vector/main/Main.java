package com.vector.main;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.vector.config.AppConfig;
import com.vector.model.Plan;
import com.vector.service.PlanService;

public class Main {
	public static void main(String[] args) {
		
		
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
	
		PlanService service = context.getBean(PlanService.class);
		
		Plan planById = service.getPlanById("p-102");
		System.out.println(planById);
		
		System.out.println("---------------------------");
		
		
		HashMap<String,Plan> hashMap = service.getAllPlans();
		Set<Entry<String, Plan>> entries = hashMap.entrySet();
		
		// Using forEach method
		entries.forEach(entry -> System.out.println(entry.getKey() + "-->" + entry.getValue()));
		
		// Using forEach loop
		for(Entry<String, Plan> e : entries ) {
			System.out.println(e.getKey() + "-->" + e.getValue());
		}
		
	
	}
}

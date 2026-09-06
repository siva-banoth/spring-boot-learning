package com.vector.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.vector.service.EmpService;

@Component
public class MyAppRunner implements ApplicationRunner {

	@Autowired
	EmpService service;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		List<String> lst = args.getOptionValues("empid");
		String str = lst.get(0);
		int empid = Integer.parseInt(str);
		
		service.readBonus(empid);
	}

}

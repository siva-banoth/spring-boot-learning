package com.vector.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vector.repository.EmpRepository;

@Service
public class EmpService {

	@Autowired
	EmpRepository empRepo;
	
	public void readBonus(int empid) {
		empRepo.getBonus(empid);
	}

	
}

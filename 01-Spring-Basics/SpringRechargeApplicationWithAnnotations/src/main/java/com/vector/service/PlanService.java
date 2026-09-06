package com.vector.service;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vector.model.Plan;
import com.vector.repository.PlanRepository;

@Service
public class PlanService {

	@Autowired
	PlanRepository repository;

	public Plan getPlanById(String planId) {
		return repository.findById(planId);
	}

	public HashMap<String, Plan> getAllPlans() {
		return repository.findAll();
	}
}

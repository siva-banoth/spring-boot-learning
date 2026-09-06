package com.vector.repository;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.vector.model.Plan;

@Repository
public class PlanRepository {

	@Autowired
	HashMap<String, Plan> plansMap;

	public Plan findById(String planId) {
		return plansMap.get(planId);
	}

	public HashMap<String, Plan> findAll() {
		return plansMap;
	}
}

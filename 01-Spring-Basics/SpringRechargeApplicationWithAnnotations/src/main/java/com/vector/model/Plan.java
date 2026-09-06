package com.vector.model;

public class Plan {

	private String planId;
	private String description;
	private double price;
	private String validity;

	public Plan(String planId, String description, double price, String validity) {
		super();
		this.planId = planId;
		this.description = description;
		this.price = price;
		this.validity = validity;
	}

	public String getPlanId() {
		return planId;
	}

	public void setPlanId(String planId) {
		this.planId = planId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getValidity() {
		return validity;
	}

	public void setValidity(String validity) {
		this.validity = validity;
	}

	@Override
	public String toString() {
		return "Plan [planId=" + planId + ", description=" + description + ", price=" + price + ", validity=" + validity
				+ "]";
	}

}

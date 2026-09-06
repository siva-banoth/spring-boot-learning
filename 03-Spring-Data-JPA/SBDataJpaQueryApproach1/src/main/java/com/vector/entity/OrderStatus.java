package com.vector.entity;

public enum OrderStatus {

	// CONSTANT("value")
	ORDERED("ordered"), PROCESSED("processed"), DELIVERED("delliverd"), REFUNDED("refunded"), CANCELLED("cancelled"),;

	private String value;

	private OrderStatus(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

}

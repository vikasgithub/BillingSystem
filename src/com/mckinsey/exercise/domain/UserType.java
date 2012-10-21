package com.mckinsey.exercise.domain;

/**
 * Created by IntelliJ IDEA. User: vikas Date: 20/10/12 Time: 9:34 AM To change
 * this template use File | Settings | File Templates.
 */
public enum UserType {
	EMPLOYEE(0.3), // Employee gets a default discount of 30%
	AFFILIATE(0.1), // affiliate get a default discount of 10%
	CUSTOMER(0); // Customers get no default discount, unless they are customers
					// for more than 2 years.

	private double defaultDiscount;

	private UserType(double defaultDiscount) {
		this.defaultDiscount = defaultDiscount;
	}

	public double getDefaultDiscount() {
		return defaultDiscount;
	}
}

package com.mckinsey.exercise.rules;

/**
 * Discount applicable to Loyal Customers. To see which customers are loyal,
 * 
 * @see CustomerLoyaltyRule
 * 
 *      Created by IntelliJ IDEA. User: vikas Date: 21/10/12 Time: 7:02 AM To
 *      change this template use File | Settings | File Templates.
 */
public class CustomerLoyaltyDiscount implements Discount {

	public static final double CUSTOMER_LOYALTY_DISCOUNT = 0.05;

	private Discount discount;

	public CustomerLoyaltyDiscount(Discount discount) {
		this.discount = discount;
	}

	public double reduce(double value) {
		double mainDiscountedValue = discount.reduce(value);
		return (mainDiscountedValue - mainDiscountedValue * getDiscountValue());
	}

	public double getDiscountValue() {
		return CUSTOMER_LOYALTY_DISCOUNT + discount.getDiscountValue();
	}
}

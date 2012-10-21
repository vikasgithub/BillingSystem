package com.mckinsey.exercise.service.impl;

import com.mckinsey.exercise.domain.Order;
import com.mckinsey.exercise.rules.CustomerLoyaltyDiscount;
import com.mckinsey.exercise.rules.CustomerLoyaltyRule;
import com.mckinsey.exercise.rules.Discount;
import com.mckinsey.exercise.rules.HighValueOrderDiscount;
import com.mckinsey.exercise.rules.UserTypeDiscount;
import com.mckinsey.exercise.service.DiscountService;

/**
 * Created by IntelliJ IDEA. User: vikas Date: 21/10/12 Time: 7:05 AM To change
 * this template use File | Settings | File Templates.
 */
public class DiscountServiceImpl implements DiscountService {
	private final CustomerLoyaltyRule customerLoyaltyRule = new CustomerLoyaltyRule();

	public Discount getUserBasedDiscount(Order order) {
		Discount userTypeDiscount = new UserTypeDiscount(order.getUser()
				.getUserType());

		if (customerLoyaltyRule.isCustomerLoyaltyApplicable(order)) {
			Discount customerLoyaltyDiscount = new CustomerLoyaltyDiscount(
					userTypeDiscount);
			return customerLoyaltyDiscount;
		} else {
			return userTypeDiscount;
		}
	}

	public Discount getOrderDiscount(Order order) {
		return new HighValueOrderDiscount();
	}
}

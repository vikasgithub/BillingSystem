package com.mckinsey.exercise.rules;

import org.junit.Assert;
import org.junit.Test;

import com.mckinsey.exercise.domain.Order;
import com.mckinsey.exercise.mother.OrderMother;
import com.mckinsey.exercise.mother.UserMother;

/**
 * Created by IntelliJ IDEA. User: vikas Date: 21/10/12 Time: 9:37 AM To change
 * this template use File | Settings | File Templates.
 */
public class CustomerLoyaltyRuleTest {

	CustomerLoyaltyRule customerLoyaltyRule = new CustomerLoyaltyRule();

	@Test
	public void testShouldReturnTrueForNormalCustomer() {
		Order order = OrderMother.createOrderForUser(UserMother
				.getNormalCustomer());
		boolean result = customerLoyaltyRule.isCustomerLoyaltyApplicable(order);

		Assert.assertFalse(result);
	}

	@Test
	public void testShouldReturnTrueForLoyalCustomer() {
		Order order = OrderMother.createOrderForUser(UserMother
				.getLoyalEmployee());
		boolean result = customerLoyaltyRule.isCustomerLoyaltyApplicable(order);
		Assert.assertTrue(result);
	}
}

package com.mckinsey.exercise.service.impl;

import org.junit.Assert;
import org.junit.Test;

import com.mckinsey.exercise.domain.Order;
import com.mckinsey.exercise.mother.OrderMother;
import com.mckinsey.exercise.mother.UserMother;
import com.mckinsey.exercise.rules.CustomerLoyaltyDiscount;
import com.mckinsey.exercise.rules.Discount;
import com.mckinsey.exercise.rules.UserTypeDiscount;
import com.mckinsey.exercise.service.DiscountService;

/**
 * Created by IntelliJ IDEA. User: vikas Date: 21/10/12 Time: 9:39 AM To change
 * this template use File | Settings | File Templates.
 */
public class DiscountServiceImplTest {

	DiscountService discountService = new DiscountServiceImpl();

	@Test
	public void testPercentageBasedDiscountForEmployee() {
		Order order = OrderMother.createOrderForUser(UserMother.getEmployee());
		Discount discount = discountService.getUserBasedDiscount(order);

		Assert.assertNotNull(discount);
		Assert.assertEquals(UserTypeDiscount.class, discount.getClass());
		Assert.assertEquals(0.3, discount.getDiscountValue(), 0.01);
	}

	@Test
	public void testPercentageBasedDiscountForAffiliate() {
		Order order = OrderMother.createOrderForUser(UserMother.getAffiliate());
		Discount discount = discountService.getUserBasedDiscount(order);

		Assert.assertNotNull(discount);
		Assert.assertEquals(UserTypeDiscount.class, discount.getClass());
		Assert.assertEquals(0.1, discount.getDiscountValue(), 0.01);
	}

	@Test
	public void testPercentageBasedDiscountForNormalCustomer() {
		Order order = OrderMother.createOrderForUser(UserMother
				.getNormalCustomer());
		Discount discount = discountService.getUserBasedDiscount(order);

		Assert.assertNotNull(discount);
		Assert.assertEquals(UserTypeDiscount.class, discount.getClass());
		Assert.assertEquals(0.0, discount.getDiscountValue(), 0.01);

	}

	@Test
	public void testPercentageBasedDiscountForLoyalCustomer() {
		Order order = OrderMother.createOrderForUser(UserMother
				.getLoyalCustomer());
		Discount discount = discountService.getUserBasedDiscount(order);

		Assert.assertNotNull(discount);
		Assert.assertEquals(CustomerLoyaltyDiscount.class, discount.getClass());
		Assert.assertEquals(0.05, discount.getDiscountValue(), 0.01);
	}

	@Test
	public void testPercentageBasedDiscountForLoyalEmployee() {
		Order order = OrderMother.createOrderForUser(UserMother
				.getLoyalEmployee());
		Discount discount = discountService.getUserBasedDiscount(order);

		Assert.assertNotNull(discount);
		Assert.assertEquals(CustomerLoyaltyDiscount.class, discount.getClass());
		Assert.assertEquals(0.35, discount.getDiscountValue(), 0.01);
	}

	@Test
	public void testPercentageBasedDiscountForLoyalAffiliate() {
		Order order = OrderMother.createOrderForUser(UserMother
				.getLoyalAffiliate());
		Discount discount = discountService.getUserBasedDiscount(order);

		Assert.assertNotNull(discount);
		Assert.assertEquals(CustomerLoyaltyDiscount.class, discount.getClass());
		Assert.assertEquals(0.15, discount.getDiscountValue(), 0.01);
	}
}

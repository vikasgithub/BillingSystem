package com.mckinsey.exercise.service.impl;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.mckinsey.exercise.domain.Bill;
import com.mckinsey.exercise.domain.Order;
import com.mckinsey.exercise.mother.OrderMother;
import com.mckinsey.exercise.mother.UserMother;

/**
 * Created by IntelliJ IDEA. User: vikas Date: 21/10/12 Time: 9:39 AM To change
 * this template use File | Settings | File Templates.
 */
public class BillingServiceImplTest {

	BillingServiceImpl billingService = new BillingServiceImpl();

	@Before
	public void before() {
		billingService.setDiscountService(new DiscountServiceImpl());
	}

	@Test
	public void testGenerateBillForEmployee() {
		Order orderWithItems = OrderMother.createOrderWithItems(UserMother
				.getEmployee());
		Bill bill = billingService.generateBill(orderWithItems);

		/*
		 * Expected bil amount 1. Cost of 1 Table = 100 2. Cost of 4 chairs = 4
		 * * 50 = 200 3. Cost of 24 eggs = 24 * 5 = 120 4. Cost of 6 milk = 6 *
		 * 10 = 60
		 * 
		 * Discount on Item 1 and 2 after discount employee = 300 - 0.3 * 300 =
		 * 210 Total Order amount = 210 + 180 = 390
		 * 
		 * High Value Discount = 15 Expected Bill amount = 390 - 15 = 375
		 */

		Assert.assertEquals(375.00, bill.getOrder().getAmount(), 0.01);
	}

	@Test
	public void testGenerateBillForAffiliate() {
		Order orderWithItems = OrderMother.createOrderWithItems(UserMother
				.getAffiliate());
		Bill bill = billingService.generateBill(orderWithItems);

		/*
		 * Expected bil amount 1. Cost of 1 Table = 100 2. Cost of 4 chairs = 4
		 * * 50 = 200 3. Cost of 24 eggs = 24 * 5 = 120 4. Cost of 6 milk = 6 *
		 * 10 = 60
		 * 
		 * Discount on Item 1 and 2 after discount employee = 300 - 0.1 * 300 =
		 * 270 Total Order amount = 270 + 180 = 450
		 * 
		 * High Value Discount = 20 Expected Bill amount = 450 - 20 = 430
		 */

		Assert.assertEquals(430, bill.getOrder().getAmount(), 0.01);
	}

	@Test
	public void testGenerateBillForNormalCustomer() {
		Order orderWithItems = OrderMother.createOrderWithItems(UserMother
				.getNormalCustomer());
		Bill bill = billingService.generateBill(orderWithItems);

		/*
		 * Expected bil amount 1. Cost of 1 Table = 100 2. Cost of 4 chairs = 4
		 * * 50 = 200 3. Cost of 24 eggs = 24 * 5 = 120 4. Cost of 6 milk = 6 *
		 * 10 = 60
		 * 
		 * No Percentage Based Discount Total Order amount = 480
		 * 
		 * High Value Discount = 20 Expected Bill amount = 480 - 20 = 460
		 */

		Assert.assertEquals(460, bill.getOrder().getAmount(), 0.01);
	}

	@Test
	public void testGenerateBillForLoyalCustomer() {
		Order orderWithItems = OrderMother.createOrderWithItems(UserMother
				.getLoyalCustomer());
		Bill bill = billingService.generateBill(orderWithItems);

		/*
		 * Expected bil amount 1. Cost of 1 Table = 100 2. Cost of 4 chairs = 4
		 * * 50 = 200 3. Cost of 24 eggs = 24 * 5 = 120 4. Cost of 6 milk = 6 *
		 * 10 = 60
		 * 
		 * No Percentage Based Discount Total Order amount = 480 LoyalDiscount =
		 * (Item1 + Item2) * 0.05 = 15 Net Amount = 480 - 15 = 465.
		 * 
		 * High Value Discount = 20 Expected Bill amount = 465 - 20 = 445
		 */

		Assert.assertEquals(445, bill.getOrder().getAmount(), 0.01);
	}
}

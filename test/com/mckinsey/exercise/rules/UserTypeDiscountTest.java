package com.mckinsey.exercise.rules;

import org.junit.Assert;
import org.junit.Test;

import com.mckinsey.exercise.domain.UserType;

/**
 * Created by IntelliJ IDEA. User: vikas Date: 21/10/12 Time: 12:50 PM To change
 * this template use File | Settings | File Templates.
 */
public class UserTypeDiscountTest {

	@Test
	public void testUserTypeDiscount() {
		Assert.assertEquals(70.0,
				new UserTypeDiscount(UserType.EMPLOYEE).reduce(100), 0.01); // employee
																			// has
																			// 30%
																			// discount
		Assert.assertEquals(90.0,
				new UserTypeDiscount(UserType.AFFILIATE).reduce(100), 0.01); // affiliate
																				// has
																				// 10%
																				// discount
		Assert.assertEquals(100.0,
				new UserTypeDiscount(UserType.CUSTOMER).reduce(100), 0.01); // customers
																			// has
																			// no
																			// default
																			// discount
	}
}

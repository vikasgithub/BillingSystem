package com.mckinsey.exercise.rules;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by IntelliJ IDEA. User: vikas Date: 21/10/12 Time: 12:12 PM To change
 * this template use File | Settings | File Templates.
 */
public class HighValueOrderDiscountTest {
	HighValueOrderDiscount highValueOrderDiscount = new HighValueOrderDiscount();

	@Test
	public void testHighValueOrderDiscount() {
		Assert.assertEquals(99.99, highValueOrderDiscount.reduce(99.99), 0.01);
		Assert.assertEquals(100, highValueOrderDiscount.reduce(105), 0.01);
		Assert.assertEquals(194.99, highValueOrderDiscount.reduce(199.99), 0.01);
		Assert.assertEquals(190, highValueOrderDiscount.reduce(200.0), 0.01);
	}

	@Test(expected = UnsupportedOperationException.class)
	public void testHighValueOrderDiscountValue() {
		highValueOrderDiscount.getDiscountValue();
	}
}

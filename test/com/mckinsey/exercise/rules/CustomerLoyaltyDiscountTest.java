package com.mckinsey.exercise.rules;

import com.mckinsey.exercise.domain.UserType;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by IntelliJ IDEA.
 * User: vikas
 * Date: 21/10/12
 * Time: 12:58 PM
 * To change this template use File | Settings | File Templates.
 */
public class CustomerLoyaltyDiscountTest {
    CustomerLoyaltyDiscount customerLoyaltyDiscount = null;

    @Before
    public void before() {
        UserTypeDiscount discount = new UserTypeDiscount(UserType.EMPLOYEE);
        customerLoyaltyDiscount = new CustomerLoyaltyDiscount(discount);
    }

    @Test
    public void testCustomerLoyaltyDiscount() {
        Assert.assertEquals(0.35, customerLoyaltyDiscount.getDiscountValue(), 0.01);
    }
}

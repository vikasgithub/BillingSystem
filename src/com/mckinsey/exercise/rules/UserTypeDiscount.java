package com.mckinsey.exercise.rules;

import com.mckinsey.exercise.domain.UserType;

/**
 * Discount applicable on different types of users.
 *
 * Created by IntelliJ IDEA.
 * User: vikas
 * Date: 21/10/12
 * Time: 7:02 AM
 * To change this template use File | Settings | File Templates.
 */
public class UserTypeDiscount implements Discount {

    private UserType userType;

    public UserTypeDiscount(UserType userType) {
        this.userType = userType;
    }

    public double reduce(double value) {
        return (value - value * getDiscountValue());
    }

    public double getDiscountValue() {
        return userType.getDefaultDiscount();
    }
}

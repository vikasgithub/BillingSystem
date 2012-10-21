package com.mckinsey.exercise.rules;

/**
 * Discount applicable on high value orders.
 *
 * Five dollars are discounted for every 100 dollars.
 *
 * Created by IntelliJ IDEA.
 * User: vikas
 * Date: 21/10/12
 * Time: 7:09 AM
 * To change this template use File | Settings | File Templates.
 */
public class HighValueOrderDiscount implements Discount {


    public double reduce(double value) {
        return (value - getNumberOfHundredsInOrderAmount(value) * 5);
    }

    public double getDiscountValue() {
        throw new UnsupportedOperationException("This discount type does not have any specific value attached.");
    }

    private int getNumberOfHundredsInOrderAmount(double value) {
        return (int)(value / 100);
    }
}

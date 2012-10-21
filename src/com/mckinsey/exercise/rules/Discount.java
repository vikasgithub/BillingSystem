package com.mckinsey.exercise.rules;

/**
 * When applied to any value, it reduces that amount by certain amount.
 *
 * Created by IntelliJ IDEA.
 * User: vikas
 * Date: 21/10/12
 * Time: 7:00 AM
 * To change this template use File | Settings | File Templates.
 */
public interface Discount {

    /**
     * Reduces the value as per the specific discount rule.
     *
     * @param value Value to be reduced.
     * @return reduced value.
     */
    double reduce(double value);

    /**
     * Returns the associates discount value.
     * @return
     */
    double getDiscountValue();
}

package com.mckinsey.exercise.service;

import com.mckinsey.exercise.rules.Discount;
import com.mckinsey.exercise.domain.Order;

/**
 * Created by IntelliJ IDEA.
 * User: vikas
 * Date: 21/10/12
 * Time: 7:03 AM
 * To change this template use File | Settings | File Templates.
 */
public interface DiscountService {

    /**
     * Returns a discount applicable on items bought by an user and his/her loyalty.
     *
     *
     * @param order
     * @return
     */
    Discount getUserBasedDiscount(Order order);

    /**
     * Returns a discount applicable on order.
     *
     * @param order
     * @return
     */
    Discount getOrderDiscount(Order order);
}

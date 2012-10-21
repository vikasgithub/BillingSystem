package com.mckinsey.exercise.service;

import com.mckinsey.exercise.domain.Bill;
import com.mckinsey.exercise.domain.Order;

/**
 * Created by IntelliJ IDEA.
 * User: vikas
 * Date: 20/10/12
 * Time: 7:34 PM
 * To change this template use File | Settings | File Templates.
 */
public interface BillingService {


    /**
     * Generates the bill for an order.
     *
     * @param order
     * @return
     */
    Bill generateBill(Order order);
}

package com.mckinsey.exercise.service.impl;

import com.mckinsey.exercise.domain.*;
import com.mckinsey.exercise.rules.Discount;
import com.mckinsey.exercise.service.BillingService;
import com.mckinsey.exercise.service.DiscountService;

import java.util.List;

/**
 * Generates a bill for an order.
 *
 * Created by IntelliJ IDEA.
 * User: vikas
 * Date: 20/10/12
 * Time: 7:35 PM
 * To change this template use File | Settings | File Templates.
 */
public class BillingServiceImpl implements BillingService {

    private DiscountService discountService;

    public Bill generateBill(Order order) {
        if (order == null || order.isEmpty()) {
            throw new IllegalArgumentException("Bill cannot be generated for an empty order.");
        }

        applyPercentageBasedDiscount(order);

        order.calculateTotal();
        Discount orderBasedDiscount = discountService.getOrderDiscount(order);
        order.applyDiscount(orderBasedDiscount);

        return new Bill(order);
    }

    private void applyPercentageBasedDiscount(Order order) {
        Discount percentageBasedDiscount = discountService.getUserBasedDiscount(order);
        List<Item> orderItems = order.getItems();
        for (Item item : orderItems) {
            if (!item.isGroceryItem()) { //percentage based discount are not applicable to grocery items.
                item.applyDiscount(percentageBasedDiscount);
            }
        }
    }

    public void setDiscountService(DiscountService discountService) {
        this.discountService = discountService;
    }
}

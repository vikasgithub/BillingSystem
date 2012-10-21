package com.mckinsey.exercise.domain;

import com.mckinsey.exercise.rules.Discount;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Order has a user, list of items.
 *
 * Created by IntelliJ IDEA.
 * User: vikas
 * Date: 20/10/12
 * Time: 9:26 AM
 * To change this template use File | Settings | File Templates.
 */
public class Order {

    /**
     * User who is doing the shopping
     */
    private User user;

    /**
     * List of items purchased by the user.
     */
    private List<Item> items = new ArrayList<Item>();

    /**
     * Total Order amount after discount
     */
    private double amount;

    /**
     * Date of which order was made.
     */
    private Date orderDate;

    /**
     * If order does not xt
     *
     * @return
     */
    public boolean isEmpty() {
        return items.isEmpty();  //To change body of created methods use File | Settings | File Templates.
    }

    /**
     * Adds an item into the order.
     *
     * @param item
     */
    public void addItem(Item item) {
        if (item == null) {
            throw new IllegalArgumentException("Null item cannot be added to the order");
        }

        items.add(item);
    }

    public User getUser() {
        return user;
    }

    public List<Item> getItems() {
        return items;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void applyDiscount(Discount discount) {
        double reducedAmount = discount.reduce(this.getAmount());
        this.setAmount(reducedAmount);
    }

    public void calculateTotal() {
        double total = 0;
        for (Item item : items) {
            total += item.getPrice();
        }

        this.setAmount(total);
    }

    public Order(User user) {
        this.user = user;
        this.orderDate = new Date();
    }

    public Date getOrderDate() {
        return this.orderDate;
    }
}
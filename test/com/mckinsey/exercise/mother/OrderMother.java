package com.mckinsey.exercise.mother;

import com.mckinsey.exercise.domain.Item;
import com.mckinsey.exercise.domain.Order;
import com.mckinsey.exercise.domain.User;

public class OrderMother {
	public OrderMother() {
	}

	public static Order createOrderForUser(User employee) {
		return new Order(employee);
	}

	public static Order createOrderWithItems(User employee) {
		Order order = new Order(employee);

		order.addItem(new Item(ProductMother.getTable(), 1));
		order.addItem(new Item(ProductMother.getChair(), 4));

		// add grocery items
		order.addItem(new Item(ProductMother.getEggs(), 24));
		order.addItem(new Item(ProductMother.getMilk(), 6));

		return order;
	}
}
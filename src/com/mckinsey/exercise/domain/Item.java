package com.mckinsey.exercise.domain;

import com.mckinsey.exercise.rules.Discount;

/**
 * Items get added to the order. Item consists of product, which a user orders.
 * Item also has quantity and price for that quantity.
 * 
 * Created by IntelliJ IDEA. User: vikas Date: 20/10/12 Time: 9:26 AM To change
 * this template use File | Settings | File Templates.
 */
public class Item {

	/**
	 * Product associated with an item
	 */
	private Product product;

	/**
	 * Quantities of an Product
	 */
	private int quantity;

	/**
	 * Price of the item.
	 */
	private double price;

	public Product getProduct() {
		return product;
	}

	public int getQuantity() {
		return quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void applyDiscount(Discount discount) {
		double reducedAmount = discount.reduce(this.getPrice());
		this.setPrice(reducedAmount);
	}

	public boolean isGroceryItem() {
		return this.getProduct().getProductType() == ProductType.GROCERY;
	}

	public Item(Product product, int quantity) {
		if (product == null) {
			throw new IllegalArgumentException(
					"Item cannot be created without a product");
		}
		this.product = product;
		this.quantity = quantity;
		this.price = this.product.getPrice() * quantity;
	}
}

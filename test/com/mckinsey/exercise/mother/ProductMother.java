package com.mckinsey.exercise.mother;

import com.mckinsey.exercise.domain.Product;
import com.mckinsey.exercise.domain.ProductType;

/**
 * Created by IntelliJ IDEA. User: vikas Date: 21/10/12 Time: 9:46 AM To change
 * this template use File | Settings | File Templates.
 */
public class ProductMother {

	public static Product getTable() {
		return new Product("table", "Table", 100.00, ProductType.OTHERS);
	}

	public static Product getChair() {
		return new Product("chair", "Chair", 50.00, ProductType.OTHERS);
	}

	public static Product getMilk() {
		return new Product("milk", "Milk", 10.00, ProductType.GROCERY);
	}

	public static Product getEggs() {
		return new Product("eggs", "Eggs", 5.00, ProductType.GROCERY);
	}
}

package com.mckinsey.exercise.domain;

import java.util.Date;

/**
 * Encapsulates a bill. Whenever a order is processed, a bill is generated.
 * 
 * 
 * Created by IntelliJ IDEA. User: vikas Date: 20/10/12 Time: 7:32 PM To change
 * this template use File | Settings | File Templates.
 */
public class Bill {

	/**
	 * Order for which bill will be generated
	 */
	private Order order;

	/**
	 * Bill Generation date
	 */
	private Date billDate;

	public Bill(Order order) {
		this.order = order;
		this.billDate = new Date();
	}

	public Order getOrder() {
		return order;
	}

	public Date getBillDate() {
		return billDate;
	}
}

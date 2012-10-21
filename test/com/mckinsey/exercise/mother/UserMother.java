package com.mckinsey.exercise.mother;

import java.util.Calendar;
import java.util.Date;

import com.mckinsey.exercise.domain.User;
import com.mckinsey.exercise.domain.UserType;

/**
 * Created by IntelliJ IDEA. User: vikas Date: 21/10/12 Time: 9:39 AM To change
 * this template use File | Settings | File Templates.
 */
public class UserMother {

	public static User getEmployee() {
		return new User("employee", "firstname", "lastname", UserType.EMPLOYEE,
				new Date());
	}

	public static User getAffiliate() {
		return new User("affiliate", "firstname", "lastname",
				UserType.AFFILIATE, new Date());
	}

	public static User getNormalCustomer() {
		return new User("customer", "firstname", "lastname", UserType.CUSTOMER,
				new Date());
	}

	public static User getLoyalCustomer() {
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.YEAR, calendar.get(Calendar.YEAR) - 3);
		return new User("loyalcustomer", "firstname", "lastname",
				UserType.CUSTOMER, calendar.getTime());
	}

	public static User getLoyalEmployee() {
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.YEAR, calendar.get(Calendar.YEAR) - 3);
		return new User("loyalcustomer", "firstname", "lastname",
				UserType.EMPLOYEE, calendar.getTime());
	}

	public static User getLoyalAffiliate() {
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.YEAR, calendar.get(Calendar.YEAR) - 3);
		return new User("loyalcustomer", "firstname", "lastname",
				UserType.AFFILIATE, calendar.getTime());
	}
}

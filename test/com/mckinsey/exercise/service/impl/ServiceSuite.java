package com.mckinsey.exercise.service.impl;

import com.mckinsey.exercise.rules.CustomerLoyaltyDiscountTest;
import com.mckinsey.exercise.rules.CustomerLoyaltyRuleTest;
import com.mckinsey.exercise.rules.HighValueOrderDiscountTest;
import com.mckinsey.exercise.rules.UserTypeDiscountTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Created by IntelliJ IDEA.
 * User: vikas
 * Date: 21/10/12
 * Time: 1:31 PM
 * To change this template use File | Settings | File Templates.
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({DiscountServiceImplTest.class, BillingServiceImplTest.class})
public class ServiceSuite {
}

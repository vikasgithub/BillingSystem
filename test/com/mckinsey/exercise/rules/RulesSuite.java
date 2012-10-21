package com.mckinsey.exercise.rules;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Created by IntelliJ IDEA. User: vikas Date: 21/10/12 Time: 1:29 PM To change
 * this template use File | Settings | File Templates.
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({ CustomerLoyaltyDiscountTest.class,
		CustomerLoyaltyRuleTest.class, HighValueOrderDiscountTest.class,
		UserTypeDiscountTest.class })
public class RulesSuite {
}

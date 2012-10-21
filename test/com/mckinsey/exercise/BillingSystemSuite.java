package com.mckinsey.exercise;

/**
 * Created by IntelliJ IDEA.
 * User: vikas
 * Date: 21/10/12
 * Time: 1:29 PM
 * To change this template use File | Settings | File Templates.
 */

import com.mckinsey.exercise.rules.RulesSuite;
import com.mckinsey.exercise.service.impl.ServiceSuite;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({RulesSuite.class, ServiceSuite.class})
public class BillingSystemSuite {
}

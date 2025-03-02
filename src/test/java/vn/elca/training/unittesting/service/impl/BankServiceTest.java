/*
 * BankServiceTest
 *
 * Project: Hiccup Framework
 *
 * Copyright 2019 by ELCA Informatik AG
 * Steinstrasse 21, CH-8036 Zurich
 * All rights reserved.
 *
 * This software is the confidential and proprietary information
 * of ELCA Informatik AG ("Confidential Information"). You
 * shall not disclose such "Confidential Information" and shall
 * use it only in accordance with the terms of the license
 * agreement you entered into with ELCA.
 */

package vn.elca.training.unittesting.service.impl;

import org.junit.jupiter.api.Test;
import vn.elca.training.unittesting.dom.Person;
import vn.elca.training.unittesting.service.IBankService;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;
/**
 * @author qvr
 *
 */
class BankServiceTest {

    /**
     * Method BankServiceImpl.calculateInterestRevenue computes the interest revenue based on the saving account of
     * person. This test case is used to test the correctness of the method.
     */
    @Test
    void testCalculateInterestRevenueWithDifferenceSavingAccountsShouldCorrectly() {
        // 1. Build input data.
        Person person = new Person(1, "Man", "Nguyen", new Date(), 3000, 2000);

        // 2. Build output data.
        double interestRevenueExpected = 280;

        // 3. Execute main test method.
        IBankService bankService = new BankService();
        double interestRevenue = bankService.calculateInterestRevenue(person);

        // 4. Check the result.
        assertEquals(interestRevenueExpected, interestRevenue, "Interest revenue is wrongly calculated");
    }
}

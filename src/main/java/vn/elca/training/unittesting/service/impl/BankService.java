/*
 * BankService
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

import vn.elca.training.unittesting.dom.Person;
import vn.elca.training.unittesting.service.IBankService;

/**
 * @author mmn
 *
 */
public class BankService implements IBankService {

    private static final double INTEREST_RATIO_PER_YEAR = 0.14;

    private static final double LEVEL_1 = 2000;
    private static final double LEVEL_2 = 4000;
    private static final double LEVEL_3 = 6000;
    private static final double LEVEL_4 = 8000;
    private static final double LEVEL_5 = 10000;

    // Interest ratio for level 1
    private static final double INTEREST_LEVEL_1 = 0.12;
    // Interest ratio for level 2
    private static final double INTEREST_LEVEL_2 = 0.14;
    // Interest ratio for level 3
    private static final double INTEREST_LEVEL_3 = 0.16;
    // Interest ratio for level 4
    private static final double INTEREST_LEVEL_4 = 0.18;
    // Interest ratio for level 5
    private static final double INTEREST_LEVEL_5 = 0.2;
    // Interest ratio for level 6
    private static final double INTEREST_LEVEL_6 = 0.24;

    /**
     * {@inheritDoc}
     */
    @Override
    public double calculateInterestRevenue(Person person) {
        double savingAccount = person.getSavingAccount();
        if (savingAccount < 10) {
            throw new IllegalArgumentException(
                "The saving account must be large or equal 10 USD in order to calculate interest revenue by level");
        }

        double result = 0;
        if (savingAccount <= LEVEL_1) {
            result = savingAccount * INTEREST_RATIO_PER_YEAR;
        } else {
            result = calculateInterestRevenueByLevel(savingAccount);
        }

        return result;
    }

    /**
     * Method to calculate interest revenue by level.<br/>
     * (LEVEL_1)2000 (LEVEL_2)4000 (LEVEL_3)6000 (LEVEL_4)8000 (LEVEL_5)10000 <br/>
     * -------------|-------------|-------------|-------------|-------------|-------------> <br/>
     * --- 0.12 ----><-- 0.14 ----><-- 0.16 ----><-- 0.18 ----><-- 0.2 ----><-- 0.24 ----> <br/>
     * 
     * @param person
     *            Person object to calculate.
     * @return interest revenue
     */
    private double calculateInterestRevenueByLevel(double savingAccount) {

        double interestRatio = INTEREST_LEVEL_1;

        if (LEVEL_1 < savingAccount && savingAccount <= LEVEL_2) {
            interestRatio = INTEREST_LEVEL_2;

        } else if (LEVEL_2 < savingAccount && savingAccount <= LEVEL_3) {
            interestRatio = INTEREST_LEVEL_3;

        } else if (LEVEL_3 < savingAccount && savingAccount <= LEVEL_4) {
            interestRatio = INTEREST_LEVEL_4;

        } else if (LEVEL_4 < savingAccount && savingAccount <= LEVEL_5) {
            interestRatio = INTEREST_LEVEL_5;

        } else if (savingAccount > LEVEL_5) {
            interestRatio = INTEREST_LEVEL_6;

        }

        return interestRatio * savingAccount;
    }
}

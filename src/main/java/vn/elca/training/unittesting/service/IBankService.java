/*
 * IBankService
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

package vn.elca.training.unittesting.service;

import vn.elca.training.unittesting.dom.Person;

/**
 * @author mmn
 *
 */
public interface IBankService {

    /**
     * * Calculating annual interest base on saving account.
     *
     * @param person
     * @return annual interest cash.
     */
    double calculateInterestRevenue(Person person);
}

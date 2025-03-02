/*
 * IPersonTaxService
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
 * This is interface of external system. We don't have implementation available during development.
 *
 * @author mmn
 */
public interface IPersonTaxService {

    /**
     * Calculating annual tax base on monthly salary.
     *
     * @param person
     * @return annual tax
     */
    double calculateAnnualTax(Person person);

    /**
     * Calculating annual tax percentage base on annual salary and tax.
     *
     * @param person
     * @return annual tax percentage (ranging from 0 to 100)
     */
    double calculateAnnualTaxPercentage(Person person);

    /**
     * Calculating inherit tax base on the amount of inherited money.
     *
     * @param person
     * @return inherit tax
     * @throws NumberFormatException
     */
    double calculateInheritTax(Person person);

    /**
     * Consolidate all tax and set to total tax property of person.
     *
     * @param person
     */
    void consolidateTax(Person person);

    void voidMethod();
}

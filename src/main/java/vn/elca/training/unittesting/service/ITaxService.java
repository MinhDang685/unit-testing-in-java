/*
 * ITaxService
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

import java.util.Date;

import vn.elca.training.unittesting.dom.Person;

/**
 * @author mmn
 *
 */
public interface ITaxService {

    /**
     * Update annual tax for input user.
     *
     * @param person
     * @return user having updated annual tax
     */
    Person updateAnnualTax(Person person);

    /**
     * Update annual tax for default user.
     *
     * @return the default user having updated annual tax.
     */
    Person updateAnnualTaxDefaultUser();

    /**
     * Update inherit tax for input user.
     *
     * @param person
     * @return user having updated inherit tax
     */
    Person updateInheritTax(Person person);

    /**
     * Update annual tax percentage for input user.
     *
     * @param person
     * @return user having updated annual tax percentage
     */
    Person updateAnnualTaxPercentage(Person person);

    /**
     * Update annual interest cash for input user.
     *
     * @param person
     * @return user having updated annual interest cash.
     */
    Person updateInterestRevenue(Person person);

    /**
     * Update default user information with input data.
     *
     * @param firstname
     * @param lastname
     * @param dateOfBirth
     * @param monthlySalary
     * @return the default user with updated data.
     * @throws NullPointerException
     */
    Person updateDefaultUserInformation(String firstname, String lastname, Date dateOfBirth, double monthlySalary);

    /**
     * Calculate and update annual income for input user.s
     *
     * @param person
     * @return user having updated annual income.
     */
    Person updateAnnualIncome(Person person);

}

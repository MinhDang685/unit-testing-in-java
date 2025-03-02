/*
 * TaxService
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

import java.util.Date;

import vn.elca.training.unittesting.dom.Person;
import vn.elca.training.unittesting.service.IBankService;
import vn.elca.training.unittesting.service.IPersonTaxService;
import vn.elca.training.unittesting.service.ITaxService;

/**
 * @author mmn
 *
 */
public class TaxService implements ITaxService {

    private static final double MIN_INHERIT_TAX = -100;

    private IPersonTaxService personTaxService = null;
    private IBankService bankService = null;
    private Person defaultUser = null;

    /**
     * Default constructor.
     */
    public TaxService() {
        defaultUser = new Person(1);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Person updateAnnualTax(Person person) {
        if (person == null) {
            return null;
        }

        double annualTax = personTaxService.calculateAnnualTax(person);
        person.setAnnualTax(annualTax);
        personTaxService.consolidateTax(person);
        return person;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Person updateAnnualTaxDefaultUser() {
        return updateAnnualTax(defaultUser);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Person updateInheritTax(Person person) {
        if (person == null) {
            return null;
        }

        double inheriteTax = personTaxService.calculateInheritTax(person);

        if (inheriteTax < MIN_INHERIT_TAX) {
            throw new IllegalArgumentException("inheriteTax must larger than equal " + MIN_INHERIT_TAX);
        }

        person.setInheritTax(inheriteTax / 2);
        inheriteTax = personTaxService.calculateInheritTax(person);
        person.setInheritTax(inheriteTax);
        return person;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Person updateAnnualTaxPercentage(Person person) {
        if (person == null) {
            return null;
        }

        double annualTax = personTaxService.calculateAnnualTax(person);
        person.setAnnualTax(annualTax);

        double annualTaxPercentage = personTaxService.calculateAnnualTaxPercentage(person);
        person.setAnnualTaxPercentage(annualTaxPercentage);
        return person;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Person updateInterestRevenue(Person person) {
        if (person == null) {
            return null;
        }

        double interestRevenue = bankService.calculateInterestRevenue(person);
        person.setInterestAvenue(interestRevenue);
        return person;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Person updateDefaultUserInformation(String firstname, String lastname, Date dateOfBirth,
        double monthlySalary) {
        defaultUser.setFirstname(firstname);
        defaultUser.setLastname(lastname);
        defaultUser.setDateOfBirth(dateOfBirth);
        defaultUser.setMonthlySalary(monthlySalary);

        return defaultUser;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Person updateAnnualIncome(Person person) {
        if (person != null) {
            // Calculate income.
            double interestAvenue = bankService.calculateInterestRevenue(person);

            // Calculate outcome.
            double annualTax = personTaxService.calculateAnnualTax(person);

            double annualIncome = person.getMonthlySalary() * 12 + interestAvenue - annualTax;

            person.setAnnualIncome(annualIncome);
        }

        return person;
    }

    public IPersonTaxService getPersonTaxService() {
        return personTaxService;
    }

    public void setPersonTaxService(IPersonTaxService personTaxService) {
        this.personTaxService = personTaxService;
    }

    public IBankService getBankService() {
        return bankService;
    }

    public void setBankService(IBankService bankService) {
        this.bankService = bankService;
    }

}

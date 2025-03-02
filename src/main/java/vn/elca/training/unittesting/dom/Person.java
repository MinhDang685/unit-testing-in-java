/*
 * Person
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

package vn.elca.training.unittesting.dom;

import java.util.Date;

/**
 * @author mmn
 *
 */
public class Person {

    private int id;
    private String firstname;
    private String lastname;
    private Date dateOfBirth;
    private double monthlySalary;
    private double annualTax;
    private double inheritTax;
    private double annualTaxPercentage;
    private double savingAccount;
    private double interestAvenue;
    private double annualIncome;
    private double totalTax;

    public Person(int id) {
        this.id = id;
    }

    public Person(int id, String firstname, String lastname, Date dateOfBirth, double monthlySalary) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.dateOfBirth = dateOfBirth;
        this.monthlySalary = monthlySalary;
    }

    public Person(int id, String firstname, String lastname, Date dateOfBirth, double monthlySalary,
        double savingAccount) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.dateOfBirth = dateOfBirth;
        this.monthlySalary = monthlySalary;
        this.savingAccount = savingAccount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public double getAnnualTax() {
        return annualTax;
    }

    public void setAnnualTax(double annualTax) {
        this.annualTax = annualTax;
    }

    public double getInheritTax() {
        return inheritTax;
    }

    public void setInheritTax(double inheritTax) {
        this.inheritTax = inheritTax;
    }

    public double getAnnualTaxPercentage() {
        return annualTaxPercentage;
    }

    public void setAnnualTaxPercentage(double annualTaxPercentage) {
        this.annualTaxPercentage = annualTaxPercentage;
    }

    public double getSavingAccount() {
        return savingAccount;
    }

    public void setSavingAccount(double savingAccount) {
        this.savingAccount = savingAccount;
    }

    public double getInterestAvenue() {
        return interestAvenue;
    }

    public void setInterestAvenue(double interestAvenue) {
        this.interestAvenue = interestAvenue;
    }

    public double getAnnualIncome() {
        return annualIncome;
    }

    public void setAnnualIncome(double annualIncome) {
        this.annualIncome = annualIncome;
    }

    public double getTotalTax() {
        return totalTax;
    }

    public void setTotalTax(double totalTax) {
        this.totalTax = totalTax;
    }

}

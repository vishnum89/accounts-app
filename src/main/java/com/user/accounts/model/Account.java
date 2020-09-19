package com.user.accounts.model;

import java.util.Date;

public class Account {

    //(Account Number, Account Name,
    //Account Type, Balance Data, Currency, Opening Available Balance

    private int accountNumber;
    private String  accountName;
    private String  accountType;
    private Date balanceData;
    private String  currency;
    private double openingAvlBal;

    public Account() {
    }

    public Account(int accountNumber, String accountName, String accountType, Date balanceData, String currency, double openingAvlBal) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.accountType = accountType;
        this.balanceData = balanceData;
        this.currency = currency;
        this.openingAvlBal = openingAvlBal;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public Date getBalanceData() {
        return balanceData;
    }

    public void setBalanceData(Date balanceData) {
        this.balanceData = balanceData;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public double getOpeningAvlBal() {
        return openingAvlBal;
    }

    public void setOpeningAvlBal(double openingAvlBal) {
        this.openingAvlBal = openingAvlBal;
    }
}

package com.user.accounts.accounts.com.user.accounts.model;

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
}

package com.user.accounts.service;

import com.user.accounts.model.Account;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class AccountsService {

    public List<Account> fetchAccounts(){
        return tempAccountList();
    }


    private List<Account> tempAccountList(){

        List<Account> accountsList = new ArrayList<Account>();

        Account account1 = new Account(585309209 ,
                "SGSavings726" ,
                "Savings" ,
                new Date("08/11/2018"),
                "SGD",
                84327.51);

        Account account2 = new Account(79106619 ,
                "AUSaving933" ,
                "Savings" ,
                new Date("08/11/2018"),
                "AUD",
                88005.93);

        accountsList.add(account1);
        accountsList.add(account2);

        return  accountsList;
    }
}

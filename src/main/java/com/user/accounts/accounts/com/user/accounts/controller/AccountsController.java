package com.user.accounts.accounts.com.user.accounts.controller;

import com.user.accounts.accounts.com.user.accounts.accounts.com.user.accounts.service.AccountsService;
import com.user.accounts.accounts.com.user.accounts.model.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AccountsController {

    @Autowired
    AccountsService accountsService;

    @GetMapping(path = "/accounts/get-accounts" , produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public ResponseEntity<List<Account>> getAccountsList(){
        HttpHeaders responseHeaders = new HttpHeaders();
        accountsService.fetchAccounts();
        return new ResponseEntity<List<Account>>(accountsService.fetchAccounts(),responseHeaders, HttpStatus.OK);
    }
    @GetMapping(path = "/accounts/get-accounts-test" , produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public List<Account> getAccountsListTest(){
        HttpHeaders responseHeaders = new HttpHeaders();
        List<Account> list = accountsService.fetchAccounts();
        return list;
    }

}

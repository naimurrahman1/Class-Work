package com.academy.hdemo.controller;

import com.academy.hdemo.dto.Account;
import com.academy.hdemo.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController()
@RequestMapping("/account")
public class AccountController {

    @Autowired
    AccountService accountService;

    @GetMapping("/detail")
    public Account detail(@RequestParam long accountId) {
        return accountService.findById(accountId);
    }

    @PostMapping("/new")
    public List<Account> newAccount(@RequestBody Account account) {
        accountService.saveAccount(account);
        return allAccount();
    }


    @PutMapping("/update")
    public List<Account> updateAccount(@RequestBody Account account) {
        accountService.update(account);
        return allAccount();
    }

    @DeleteMapping("/delete")
    public List<Account> delete(@RequestBody Account account) {
        accountService.deleteAccount(account);
        return allAccount();
    }

    @GetMapping("/allAccount")
    public List allAccount() {
        return accountService.getAllAccounts();
    }

    @PostMapping("/transfer")
    public List<Account> transfer(@RequestParam long fromAccountId, @RequestParam long toAccountId, @RequestParam long amount) {
        accountService.transferMoney(fromAccountId,toAccountId,amount);
        return allAccount();
    }




}

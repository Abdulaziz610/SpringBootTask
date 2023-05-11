package com.codeline.sampleProject.Controller;

import com.codeline.sampleProject.Models.Account;
import com.codeline.sampleProject.Service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class AccountController {
 @Autowired
 AccountService accountService;

    @RequestMapping("account/create")
    public void saveAccount () {
        createAccount();
}


    public void createAccount() {
        Account account = new Account();
        account.setAccountType("Saving");
        account.setAccountNumber("666555666555");
        account.setId(9092L);
        account.setBankName("Muscat");
        account.setBankBranch("Seeb");
        account.setBranchCode(777);
        account.setCreatedDate(new Date());
        account.setIsActive(true);
        account.setSwiftCode("9986");
        account.setAccountHolderName("Abdulaziz");
        accountService.saveAccount(account);

    }}
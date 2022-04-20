package service;

import constant.NewAccountConstants;
import model.Account;
import model.User;
import org.openqa.selenium.WebElement;

public class NewAccount extends Login{
    public NewAccount(User user){
        setUser(user);
    }

    public void test(Account account){
        findByXpath(NewAccountConstants.FORM).click();
        WebElement customerId = findByXpath(NewAccountConstants.CUSTOMER_ID);
        customerId.sendKeys(account.getCustomerId());

        WebElement accountType = findByXpath(NewAccountConstants.ACCOUNT_TYPE);
        accountType.sendKeys(account.getAccountType());

        WebElement initialDeposit = findByXpath(NewAccountConstants.INITIAL_DEPOSIT);
        initialDeposit.sendKeys(account.getInitialDeposit());
        findByXpath(NewAccountConstants.SUBMIT).click();
    }
}

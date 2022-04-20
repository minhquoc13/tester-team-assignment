package service;

import model.Transaction;
import model.User;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WithdrawalService extends Login {
    public WithdrawalService(User user) {
        setUser(user);
    }
    public void test(Transaction trans) {
        getDriver().findElement(By.xpath("/html/body/div[3]/div/ul/li[9]/a")).click();

        WebElement accountNoEl = findByXpath("/html/body/table/tbody/tr/td/table/tbody/tr[6]/td[2]/input");
        accountNoEl.sendKeys(trans.getAccountNo());


        WebElement amountEl = findByXpath("/html/body/table/tbody/tr/td/table/tbody/tr[7]/td[2]/input");
        amountEl.sendKeys(trans.getAmount());
        WebElement descriptionEl = findByXpath("/html/body/table/tbody/tr/td/table/tbody/tr[8]/td[2]/input");
        descriptionEl.sendKeys(trans.getDescription());

        findByXpath("/html/body/table/tbody/tr/td/table/tbody/tr[12]/td[2]/input[1]").click();
    }
}

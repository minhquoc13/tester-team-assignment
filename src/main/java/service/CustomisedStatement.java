package service;


import model.Customized;
import model.User;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CustomisedStatement extends Login{
    public CustomisedStatement(User user){
        setUser(user);
    }

    public void test(Customized customized){
        getDriver().findElement(By.xpath("/html/body/div[3]/div/ul/li[14]/a")).click();

        WebElement AccountNo = getDriver().findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[6]/td[2]/input"));
        AccountNo.sendKeys(customized.getAccountNo());

        WebElement FromDate = getDriver().findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[7]/td[2]/input"));
        FromDate.sendKeys(customized.getFromDate());

        WebElement ToDate = getDriver().findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[8]/td[2]/input"));
        ToDate.sendKeys(customized.getToDate());

        WebElement MinimumTransactionValue = getDriver().findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[9]/td[2]/input"));
        MinimumTransactionValue.sendKeys(customized.getMinimumTransactionValue());

        WebElement NumberOfTransaction = getDriver().findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[10]/td[2]/input"));
        NumberOfTransaction.sendKeys(customized.getNumberOfTransaction());

        getDriver().findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[13]/td[2]/input[1]")).click();

    }
}

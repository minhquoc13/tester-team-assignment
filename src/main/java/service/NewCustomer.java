package service;

import model.Customer;
import model.User;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class NewCustomer extends Login {
    public NewCustomer(User user) {
        setUser(user);
    }


    public void test(Customer customer) {
        getDriver().findElement(By.xpath("/html/body/div[3]/div/ul/li[2]/a")).click();

        //customer name
        WebElement customerName = findByXpath("/html/body/table/tbody/tr/td/table/tbody/tr[4]/td[2]/input");
        customerName.sendKeys(customer.getName());

        // gender
        WebElement male = findByXpath("/html/body/table/tbody/tr/td/table/tbody/tr[5]/td[2]/input[1]");
        WebElement female = findByXpath("/html/body/table/tbody/tr/td/table/tbody/tr[5]/td[2]/input[2]");
        if (customer.getGender().equals("male"))
            male.click();
        else female.click();

        // date of birht
        WebElement dateOfBirth = findByXpath("/html/body/table/tbody/tr/td/table/tbody/tr[6]/td[2]/input");
        dateOfBirth.sendKeys(customer.getDateOfBirth());

        // address
        WebElement address = findByXpath("/html/body/table/tbody/tr/td/table/tbody/tr[7]/td[2]/textarea");
        address.sendKeys(customer.getAddress());

        // city
        WebElement city = findByXpath("/html/body/table/tbody/tr/td/table/tbody/tr[8]/td[2]/input");
        city.sendKeys(customer.getAddress());

        // state
        WebElement state = findByXpath("/html/body/table/tbody/tr/td/table/tbody/tr[9]/td[2]/input");
        state.sendKeys(customer.getState());

        // PIN
        WebElement pin = findByXpath("/html/body/table/tbody/tr/td/table/tbody/tr[10]/td[2]/input");
        pin.sendKeys(customer.getPIN());

        // mobile number
        WebElement mobileNumber = findByXpath("/html/body/table/tbody/tr/td/table/tbody/tr[11]/td[2]/input");
        mobileNumber.sendKeys(customer.getMobileNumber());

        // email
        WebElement email = findByXpath("/html/body/table/tbody/tr/td/table/tbody/tr[12]/td[2]/input");
        email.sendKeys(customer.getEmail());

        // password
        WebElement password = findByXpath("/html/body/table/tbody/tr/td/table/tbody/tr[13]/td[2]/input");
        password.sendKeys(customer.getPassword());

        findByXpath("/html/body/table/tbody/tr/td/table/tbody/tr[14]/td[2]/input[1]").click();
    }
}

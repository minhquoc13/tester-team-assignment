package service;

import constant.NewCustomerConstants;
import model.Customer;
import model.User;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class NewCustomer extends Login {
    public NewCustomer(User user) {
        setUser(user);
    }


    public void test(Customer customer) {
        getDriver().findElement(By.xpath(NewCustomerConstants.FORM)).click();

        //customer name
        WebElement customerName = findByXpath(NewCustomerConstants.NAME);
        customerName.sendKeys(customer.getName());

        // gender
        WebElement male = findByXpath(NewCustomerConstants.MALE);
        WebElement female = findByXpath(NewCustomerConstants.FEMALE);
        if (customer.getGender().equals("male"))
            male.click();
        else female.click();

        // date of birht
        WebElement dateOfBirth = findByXpath(NewCustomerConstants.DATE_OF_BIRTH);
        dateOfBirth.sendKeys(customer.getDateOfBirth());

        // address
        WebElement address = findByXpath(NewCustomerConstants.ADDRESS);
        address.sendKeys(customer.getAddress());

        // city
        WebElement city = findByXpath(NewCustomerConstants.CITY);
        city.sendKeys(customer.getAddress());

        // state
        WebElement state = findByXpath(NewCustomerConstants.STATE);
        state.sendKeys(customer.getState());

        // PIN
        WebElement pin = findByXpath(NewCustomerConstants.PIN);
        pin.sendKeys(customer.getPIN());

        // mobile number
        WebElement mobileNumber = findByXpath(NewCustomerConstants.MOBILE_NUMBER);
        mobileNumber.sendKeys(customer.getMobileNumber());

        // email
        WebElement email = findByXpath(NewCustomerConstants.EMAIL);
        email.sendKeys(customer.getEmail());

        // password
        WebElement password = findByXpath(NewCustomerConstants.PASSWORD);
        password.sendKeys(customer.getPassword());

        findByXpath(NewCustomerConstants.SUBMIT).click();
    }
}

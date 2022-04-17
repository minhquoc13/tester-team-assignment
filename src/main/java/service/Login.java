package service;

import config.DriverConfiguration;
import model.User;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login {
    private WebDriver driver;
    private User user;
    public Login(User user) {
        this.user = user;
        driver = DriverConfiguration.getWebDriver("https://www.demo.guru99.com/V4/");
        driver.manage().window().maximize();
        login();
    }

    public Login() {

    }

    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public WebDriver getDriver(){
        return this.driver;
    }

    public void login(){
        WebElement usernameElement = driver.findElement(By.xpath("/html/body/form/table/tbody/tr[1]/td[2]/input"));
        usernameElement.sendKeys(user.getUsername());
        WebElement passwordElement = driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input"));
        passwordElement.sendKeys(user.getPassword());
        driver.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td[2]/input[1]")).click();
    }
}

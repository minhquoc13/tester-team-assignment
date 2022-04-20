package service;

import config.DriverConfiguration;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import model.User;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Login {
    private WebDriver driver;
    private User user;

    public Login(User user) {
        this.user = user;
    }

    void setUp(){
        driver = DriverConfiguration.getWebDriver("https://www.demo.guru99.com/V4/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public WebElement findByXpath(String xpath) {
        return getDriver().findElement(By.xpath(xpath));
    }

    public void login() {
        setUp();
        WebElement usernameElement = driver.findElement(By.xpath("/html/body/form/table/tbody/tr[1]/td[2]/input"));
        usernameElement.sendKeys(user.getUsername());
        WebElement passwordElement = driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input"));
        passwordElement.sendKeys(user.getPassword());
        driver.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td[2]/input[1]")).click();
    }
}

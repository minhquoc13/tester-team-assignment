import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login {
    private WebDriver driver;
    public Login(){
        driver = DriverConfiguration.getWebDriver("https://www.demo.guru99.com/V4/");
        driver.manage().window().maximize();
    }

    public WebDriver getDriver(){
        return this.driver;
    }

    public void login(String username, String password){
        WebElement usernameElement = driver.findElement(By.xpath("/html/body/form/table/tbody/tr[1]/td[2]/input"));
        usernameElement.sendKeys(username);
        WebElement passwordElement = driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input"));
        passwordElement.sendKeys(password);
        driver.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td[2]/input[1]")).click();
    }

    public void test(){
        login("mngr399630", "apavEba");
    }

//    public static void main(String[] args) {
//        Login login = new Login();
//        login.test();
//    }
}

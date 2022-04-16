import org.openqa.selenium.WebDriver;

public class Login {
    private WebDriver driver;
    public Login(){
        driver = DriverConfiguration.getWebDriver("https://www.demo.guru99.com/V4/");
    }
}

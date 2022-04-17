package config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverConfiguration {
    public static WebDriver getWebDriver(String url) {
        WebDriver webDriver = new ChromeDriver();
        webDriver.get(url);
        return webDriver;
    }
}

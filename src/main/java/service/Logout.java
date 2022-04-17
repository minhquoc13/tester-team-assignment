package service;

import model.User;
import org.openqa.selenium.By;

public class Logout extends Login {
    public Logout(User user){
        super();
        setUser(user);
        login();
    }

    public void logout(){
        getDriver().findElement(By.xpath("/html/body/div[3]/div/ul/li[15]/a")).click();
    }

    public static void main(String[] args) {
        new Logout(new User("mngr399630", "apavEba")).logout();
    }
}

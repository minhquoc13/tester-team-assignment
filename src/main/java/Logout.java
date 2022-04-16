import org.openqa.selenium.By;

public class Logout extends Login{
    public Logout(){
        super();
        login("mngr399630", "apavEba");
    }

    public void logout(){
        getDriver().findElement(By.xpath("/html/body/div[3]/div/ul/li[15]/a")).click();
    }

    public static void main(String[] args) {
        new Logout().logout();
    }
}

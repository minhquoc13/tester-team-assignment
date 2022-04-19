package test;

import service.Login;
import model.User;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LoginTest {
    List<User> users = new ArrayList<>();

    public LoginTest() throws IOException {
        readTestCase();
        users.forEach(user -> {
            Login login = new Login(user);
            login.login();
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            login.getDriver().quit();
        });
    }

    public void readTestCase() throws IOException {
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("login-testcase.xlsx").getFile());
        FileInputStream fileInputStream = new FileInputStream(file);
        XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
        XSSFSheet sheet = workbook.getSheetAt(0);

        for (int i = 0; i < 4; i++) {
            String username, password;
            try {
                username = sheet.getRow(i).getCell(0).getStringCellValue();
            } catch (Exception e) {
                username = "";
            }
            try {
                password = sheet.getRow(i).getCell(1).getStringCellValue();
            } catch (Exception e) {
                password = "";
            }
            User user = new User(username, password);
            users.add(user);
            System.out.println(user);
        }
    }

    public static void main(String[] args) throws IOException {
        LoginTest loginTest = new LoginTest();
    }
}

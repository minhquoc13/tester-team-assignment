package test;

import model.Account;
import model.User;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import service.NewAccount;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class NewAccountTest {
    private List<Account> accounts;
    XSSFSheet sheet;

    public NewAccountTest() throws IOException {
        accounts = new ArrayList<>();
        readTestCase();
        accounts.forEach(account -> {
            NewAccount newAccount = new NewAccount(new User("mngr399630", "apavEba"));
            newAccount.login();
            newAccount.test(account);
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            newAccount.getDriver().quit();
        });
    }

    private String getCell(int i, int j){
        try{
            String data = sheet.getRow(i).getCell(j).getStringCellValue();
            return data;
        }catch (Exception e){
            return "";
        }
    }

    private void readTestCase() throws IOException {
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("account-testcase.xlsx").getFile());
        FileInputStream fileInputStream = new FileInputStream(file);
        XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
        sheet = workbook.getSheetAt(0);
        for(int i=0; i<6; i++){
            Account account = new Account();
            account.setCustomerId(getCell(i, 0));
            account.setAccountType(getCell(i, 1));
            account.setInitialDeposit(getCell(i, 2));
            accounts.add(account);
            System.out.println(account);
        }
    }

    public static void main(String[] args) throws IOException {
        new NewAccountTest();
    }
}

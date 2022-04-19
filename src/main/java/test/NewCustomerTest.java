package test;

import model.Customer;
import model.User;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import service.NewCustomer;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class NewCustomerTest {
    private List<Customer> customers = new ArrayList<>();
    XSSFSheet sheet;
    public NewCustomerTest() throws IOException {
        readTestCase();
        customers.forEach(customer -> {
            NewCustomer newCustomer = new NewCustomer(new User("mngr399630", "apavEba"));
            newCustomer.login();
            newCustomer.test(customer);
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            newCustomer.getDriver().quit();
        });
    }

    public String getCell(int i, int j){
        try{
            String data = sheet.getRow(i).getCell(j).getStringCellValue();
            return data;
        }catch (Exception e){
            return "";
        }
    }

    public void readTestCase() throws IOException {
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("customer-testcase.xlsx").getFile());
        FileInputStream fileInputStream = new FileInputStream(file);
        XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
        sheet = workbook.getSheetAt(0);

        for(int i=0; i<19; i++){
            Customer customer = new Customer();
            customer.setName(getCell(i, 0));
            customer.setGender(getCell(i, 1));
            customer.setDateOfBirth(getCell(i, 2));
            customer.setAddress(getCell(i, 3));
            customer.setCity(getCell(i, 4));
            customer.setState(getCell(i, 5));
            customer.setPIN(getCell(i, 6));
            customer.setMobileNumber(getCell(i, 7));
            customer.setEmail(getCell(i, 8));
            customer.setPassword(getCell(i, 9));
            customers.add(customer);
            System.out.println(customer);
        }
    }

    public static void main(String[] args) throws IOException {
        new NewCustomerTest();
    }
}

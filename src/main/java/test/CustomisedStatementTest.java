package test;

import model.Customized;
import model.User;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import service.CustomisedStatement;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CustomisedStatementTest {
    private List<Customized> customList = new ArrayList<>();
    XSSFSheet sheet;

    public CustomisedStatementTest() throws IOException {
        redTestCase();
        customList.forEach(custom -> {
            CustomisedStatement customisedStatement = new CustomisedStatement(new User("mngr399630", "apavEba"));
            customisedStatement.login();
            customisedStatement.test(custom);
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            customisedStatement.getDriver().quit();
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
    public void redTestCase() throws IOException {
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("customizedstatement-testcase.xlsx").getFile());
        FileInputStream fileInputStream = new FileInputStream(file);
        XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
        sheet = workbook.getSheetAt(0);

        for(int i=0; i<11; i++){
            Customized customized = new Customized();

            customized.setAccountNo(getCell(i, 0));
            customized.setFromDate(getCell(i, 1));
            customized.setToDate(getCell(i, 2));
            customized.setMinimumTransactionValue(getCell(i, 3));
            customized.setNumberOfTransaction(getCell(i, 4));

            customList.add(customized);
            System.out.println(customized);
        }
    }

    public static void main(String [] args) throws IOException {
        CustomisedStatementTest customisedStatementTest = new CustomisedStatementTest();

    }
}

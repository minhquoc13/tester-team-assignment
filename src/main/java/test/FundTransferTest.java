package test;

import model.Fund;
import model.User;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import service.FundTransfer;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FundTransferTest {
    private List<Fund> fundList = new ArrayList<>();
    XSSFSheet sheet;

    public FundTransferTest() throws IOException{
        redTestCase();
        fundList.forEach(Fund -> {
            FundTransfer fundTransfer = new FundTransfer(new User("mngr399630", "apavEba"));
            fundTransfer.login();
            fundTransfer.testFund(Fund);
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            fundTransfer.getDriver().quit();
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
        File file = new File(classLoader.getResource("fundtransfer-testcase.xlsx").getFile());
        FileInputStream fileInputStream = new FileInputStream(file);
        XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
        sheet = workbook.getSheetAt(0);

        for(int i=0; i<13; i++){
            Fund fund = new Fund();
            fund.setPayersAccountNo(getCell(i, 0));
            fund.setPayeesAccountNo(getCell(i, 1));
            fund.setAmount(getCell(i, 2));
            fund.setDescription(getCell(i, 3));
            fundList.add(fund);
            System.out.println(fund);
        }

    }
    public static void main(String [] args) throws IOException {
        new FundTransferTest();
    }

}

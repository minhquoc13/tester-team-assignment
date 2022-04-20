package service;

import model.Fund;
import model.User;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.Scanner;

public class FundTransfer extends Login {
	public FundTransfer(User user) {
		setUser(user);
	}


	public void testFund(Fund fund) {
		getDriver().findElement(By.xpath("/html/body/div[3]/div/ul/li[10]/a")).click();

		WebElement PayersAccountNo = getDriver().findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[4]/td[2]/input"));
		PayersAccountNo.sendKeys(fund.getPayersAccountNo());

		WebElement PayeesAccountNo = getDriver().findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[5]/td[2]/input"));
		PayeesAccountNo.sendKeys(fund.getPayeesAccountNo());

		WebElement getAmount = getDriver().findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[6]/td[2]/input"));
		getAmount.sendKeys(fund.getAmount());

		WebElement getDescription = getDriver().findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[7]/td[2]/input"));
		getDescription.sendKeys(fund.getDescription());

		Option();
	}
	public void Option() {
		int pressKey;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Press 1 or 2 in the key: ");
		pressKey = scanner.nextInt();
		
		switch (pressKey) {
		case 1: {
			getDriver().findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[8]/td[2]/input[1]")).click();
			break;
		}
		case 2:{
			getDriver().findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[8]/td[2]/input[2]")).click();
			break;
		}
		default:
			System.out.println("Số nhập vào phải nằm trong khoảng từ 1 đến 2.");
		}
		
	}

}

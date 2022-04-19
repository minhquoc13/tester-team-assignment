package service;

import model.User;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.Scanner;

public class FundTransfer extends Login {
	private FundTransfer(User user) {
		super();
		setUser(user);
		login();
	}


	public void fundTransfer(String row1, String row2, String row3, String row4) {
		getDriver().findElement(By.xpath("/html/body/div[3]/div/ul/li[10]")).click();
		WebElement Row1 = getDriver().findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[4]/td[2]/input"));
		Row1.sendKeys(row1);
		WebElement Row2 = getDriver().findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[5]/td[2]/input"));
		Row2.sendKeys(row2);
		WebElement Row3 = getDriver().findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[6]/td[2]/input"));
		Row3.sendKeys(row3);
		WebElement Row4 = getDriver().findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[7]/td[2]/input"));
		Row4.sendKeys(row4);
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
	public void Input() {
		fundTransfer("123","456","12.000","Beautiful");
	}
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		FundTransfer run = new FundTransfer(new User());
		run.Input();

	}

}

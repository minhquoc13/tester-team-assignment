//import java.util.Scanner;
//
//import model.User;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
//
//public class CustomizedStatementForm extends login.Login{
//	public CustomizedStatementForm() {
//		super();
//	}
//	public void customizedStatementForm(String account, String fromDate, String toDate, String mTransaction, String nTransaction) {
//		getDriver().findElement(By.xpath("/html/body/div[3]/div/ul/li[14]")).click();
//
//		WebElement AcountElement = getDriver().findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[6]/td[2]/input"));
//		AcountElement.sendKeys(account);
//
//		WebElement FromDateElement = getDriver().findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[7]/td[2]/input"));
//		FromDateElement.sendKeys(fromDate);
//
//		WebElement ToDateElement = getDriver().findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[8]/td[2]/input"));
//		ToDateElement.sendKeys(toDate);
//
//		WebElement MTransactionElement = getDriver().findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[9]/td[2]/input"));
//		MTransactionElement.sendKeys(mTransaction);
//
//		WebElement NTransactionElement = getDriver().findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[10]/td[2]/input"));
//		NTransactionElement.sendKeys(nTransaction);
//
//		Option();
//
//	}
//
//	public void Option() {
//		int pressKey;
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Press 1 or 2 in the key: ");
//		pressKey = scanner.nextInt();
//
//		switch (pressKey) {
//		case 1: {
//			getDriver().findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[13]/td[2]/input[1]")).click();
//			break;
//		}
//		case 2:{
//			getDriver().findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[13]/td[2]/input[2]")).click();
//			break;
//		}
//		default:
//			System.out.println("Số nhập vào phải nằm trong khoảng từ 1 đến 2.");
//		}
//	}
//
//	public void Input() {
//		customizedStatementForm("123", "04/18/2021", "04/19/2022", "10.000", "5.000");
//	}
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		CustomizedStatementForm Run = new CustomizedStatementForm();
//		Run.Input();
//	}
//
//}

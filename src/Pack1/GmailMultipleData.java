package Pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import Pack2.XLS_Reader;

public class GmailMultipleData {
	@Test
	public void exception_IFCondition() throws Exception{
		XLS_Reader xls=new XLS_Reader("D:/test/mytestdata.xlsx");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		for(int i=2;i<=xls.getRowCount("testdata");i++){
		
		driver.get("http://gmail.com");
		driver.findElement(By.id("Email")).sendKeys(xls.getCellData("testdata", 0, i));
		driver.findElement(By.id("next")).click();
		driver.findElement(By.id("Passwd")).sendKeys(xls.getCellData("testdata", 1, i));
		driver.findElement(By.id("signIn")).click();
		}
		}

}

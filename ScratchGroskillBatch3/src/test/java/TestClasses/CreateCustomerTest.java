package TestClasses;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageClasses.CreateCustomersPage;
import Utilities.CommonFunctions;
import Utilities.DriverIntitialization;
import Utilities.FetchDataFromExcel;

public class CreateCustomerTest extends DriverIntitialization {
	
	public static String customerID;
	
	@DataProvider(name="registerpatientdata")
	public Object [][] dp1()
	{
    return new Object[][]
	{
    {"Harry","14-09-1992","kamakhyanagar","dhenkanal","odisha","759018","9955456255","qwer@gmail.com","AmeserY"},
    {"Jhon","12-02-1992","bandra","mumbai","maharastra","3000526","9583969410","asdf@gmail.com","AmeserY"}
	};
	}

	
	@Test(dataProvider="registerpatientdata")
	public void createCustomer(String uname,String dob,String add,String city,String state,String pin,String mob,String email,String pwd) throws IOException
	{
		LoginTest loginTest = new LoginTest();
		loginTest.loginApplication();
		driver.findElement(By.xpath(CreateCustomersPage.newCust())).click();
		driver.findElement(By.xpath(CreateCustomersPage.cusName())).sendKeys(uname);
		driver.findElement(By.xpath(CreateCustomersPage.gender())).click();
		driver.findElement(By.xpath(CreateCustomersPage.doB())).sendKeys(dob);
		driver.findElement(By.xpath(CreateCustomersPage.address())).sendKeys(add);
		driver.findElement(By.xpath(CreateCustomersPage.city())).sendKeys(city);
		driver.findElement(By.xpath(CreateCustomersPage.state())).sendKeys(state);
		driver.findElement(By.xpath(CreateCustomersPage.pin())).sendKeys(pin);
		driver.findElement(By.xpath(CreateCustomersPage.mobile())).sendKeys(mob);
		driver.findElement(By.xpath(CreateCustomersPage.email())).sendKeys(CommonFunctions.generateRandomEmail());
		driver.findElement(By.xpath(CreateCustomersPage.password())).sendKeys(pwd);
		driver.findElement(By.xpath(CreateCustomersPage.submit())).click();
		FetchDataFromExcel.setValueExcel(1, 2, customerID);
		
		
		
	}
}



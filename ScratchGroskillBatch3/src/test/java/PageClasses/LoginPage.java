package PageClasses;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Utilities.FetchDataFromExcel;

public class LoginPage {
	
	@FindBy(xpath ="//input[@name='uid']")
	WebElement uid;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement password;
	
	@FindBy(xpath="//input[@name='btnLogin']")
	WebElement login;
	
	public static String enterUserID()
	{
		String uid="//input[@name='uid']";
		return uid;
	}
	public static String enterPassword()
	{
		String password="//input[@name='password']";
		return password;
	}
	public static String loginBtn()
	{
		String loginbtn="//input[@name='btnLogin']";
		return loginbtn;
	}
	public void enterUserID1() throws IOException
	{
		uid.sendKeys(FetchDataFromExcel.getValueExcel(1, 0));
	}
	public void enterpassword() throws IOException
	{
		uid.sendKeys(FetchDataFromExcel.getValueExcel(1, 1));
	}
	public void clicksubmit() throws IOException
	{
		login.click();
	}
	 
	

}

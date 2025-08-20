package TestClasses;
import java.io.IOException;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import PageClasses.LoginPage;
import Utilities.DriverIntitialization;
import Utilities.FetchDataFromExcel;

public class LoginTest extends DriverIntitialization {

    static FetchDataFromExcel ex1 = new FetchDataFromExcel();

    @Test(retryAnalyzer = Utilities.RetryAnalyzer.class, groups = {"regression"})
    public void loginApplication() throws IOException {
        // Fetching data from Excel (row 1)
        String username = ex1.getValueExcel(1, 0);
        String password = ex1.getValueExcel(1, 1);

       
        driver.findElement(By.xpath(LoginPage.enterUserID())).sendKeys(username);
        driver.findElement(By.xpath(LoginPage.enterPassword())).sendKeys(password);
        driver.findElement(By.xpath(LoginPage.loginBtn())).click();
    }
	






}


		
	




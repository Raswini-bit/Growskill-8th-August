package PageClasses;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;

	public class DeleteCustomerPage {
	    private WebDriver driver;
	    private By customerIdField = By.name("cusid");
	    private By submitBtn = By.name("AccSubmit");
	    private By alert = By.tagName("alert");

	    public DeleteCustomerPage(WebDriver driver) {
	        this.driver = driver;
	    }

	    public void deleteCustomer(String customerId) {
	        driver.findElement(customerIdField).sendKeys(customerId);
	        driver.findElement(submitBtn).click();
	    }

	    public String getAlertText() {
	        return driver.switchTo().alert().getText();
	    }

	    public void acceptAlert() {
	        driver.switchTo().alert().accept();
	    }
}

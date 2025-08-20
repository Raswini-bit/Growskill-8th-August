package PageClasses;

public class CreateCustomersPage {
	public static String cusName()
	{
		String cusName="//input[@name='name']";
		return cusName;
	}
	public static String gender()
	{
		String gender="//input[@name='rad1' and @value='m']";
		return gender;
	}
	public static String doB()
	{
		String doB="//input[@id='dob']";
		return doB;
	}
	public static String address()
	{
		String address="//textarea[@name='addr']";
		return address;
	}
	public static String city()
	{
		String city="//input[@name='city']";
		return city;
	}
	public static String state()
	{
		String state="//input[@name='state']";
		return state;
	}
	public static String pin()
	{
		String pin="//input[@name='pinno']";
		return pin;
	}
	public static String mobile()
	{
		String mobile="//input[@name='telephoneno']";
		return mobile;
	}
	public static String email()
	{
		String email="//input[@name='emailid']";
		return email;
	}
	public static String password()
	{
		String password="//input[@name='password']";
		return password;
	}
	public static String submit()
	{
		String submit="//input[@name='sub']";
		return submit;
	}
	public static String newCust() {
		String newCust="//a[text()='New Customer']";
		return newCust ;
	}

}

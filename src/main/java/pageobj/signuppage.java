package pageobj;

import java.time.Duration;

import org.openqa.selenium.By;

import base.basepro;

public class signuppage extends basepro 
{
	public static By loginbutton = By.xpath("//a[@title='Login']");
	public static By signup = By.xpath("//a[text()='Sign up']");
	public static By useremailid = By.name("user[email]");
	public static By userpassword = By.name("user[password]");
	public static By phonenumber = By.name("user-phone");
	public static By PleaseCompleteRequiredFields = By.id("t-signup-submit");
	public static void clicksignup()
	{
		driver.findElement(loginbutton).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		driver.findElement(signup).click();
	}
	public static void enteruseremailid(String mail)
	{
		driver.findElement(useremailid).clear();
		driver.findElement(useremailid).sendKeys(mail);
	}
	public static void enterpassword(String pw)
	{
		driver.findElement(userpassword).clear();
		driver.findElement(userpassword).sendKeys(pw);
	}
	public static void enterphonenum(String pn)
	{
		driver.findElement(phonenumber).clear();
		driver.findElement(phonenumber).sendKeys(pn);
	}
	public static void clickPleaseCompleteRequiredFields()
	{
		driver.findElement(PleaseCompleteRequiredFields).click();
	}
}

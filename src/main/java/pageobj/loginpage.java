package pageobj;

import org.openqa.selenium.By;

import base.basepro;

public class loginpage extends basepro
{
	public static By loginbutton = By.xpath("//a[@title='Login']");
	public static By emailId = By.id("user_email");
	public static By password = By.id("user_password");
	public static By signin = By.name("commit");
	public static By invaliderror = By.xpath("//p[text()='Invalid email or password.']");
	public static void clickloginbutton() 
	{
		driver.findElement(loginbutton).click();
	}
	public static void enteremailId(String mail)
	{
		driver.findElement(emailId).clear();
		driver.findElement(emailId).sendKeys(mail);
	}
	public static void enterpassword(String pw)
	{
		driver.findElement(password).clear();
		driver.findElement(password).sendKeys(pw);
	}
	public static void clicksignin()
	{
		driver.findElement(signin).click();
	}
	public static String captureinvaliderror()
	{
		String text= driver.findElement(invaliderror).getText();
		//System.out.println(text);
		return text;
	}
	
}

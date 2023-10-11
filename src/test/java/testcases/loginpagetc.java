package testcases;

import pageobj.loginpage;

public class loginpagetc extends loginpage 
{
	public static void main(String[] args)  
	{
		launchchrome("https://cucumber.io/");
		clickloginbutton();
		enteremailId("tanuja@gmail.com");
		enterpassword("tanu345");
		clicksignin();
		captureinvaliderror();
		String actual = captureinvaliderror();
		String expected = "Invalid email or password.";
		if(actual.equals(expected))
		{
			System.out.println("TC passed");
		}
		else
		{
			System.out.println("TC not passed");
		}
	}
	

}

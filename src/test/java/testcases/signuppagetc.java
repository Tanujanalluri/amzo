package testcases;
import pageobj.signuppage;

public class signuppagetc extends signuppage{

	public static void main(String[] args)
	{
		launchchrome("https://cucumber.io/");
		clicksignup();
		enteruseremailid("tanu@gmail.com");
		enterpassword("tanu27");
		enterphonenum("5476829829");
		clickPleaseCompleteRequiredFields();
		
	}

}

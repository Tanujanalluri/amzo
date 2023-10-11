package xcelreadnwrite;

import java.io.FileInputStream;
import java.io.FileOutputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import excelutilss.xcelutils;
import pageobj.loginpage;

public class read1 extends loginpage
{
	public static void validateinvaliddata() throws IOException
	{
		launchchrome("https://cucumber.io/");
		clickloginbutton();
		String emailid ="";
		String password="";
		FileInputStream fs = new FileInputStream("F:\\Book1.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fs);
		XSSFSheet sheet = workbook.getSheetAt(0);
		int rows=sheet.getLastRowNum();
		for(int i=1;i<=rows;i++)
		{
			XSSFRow row=sheet.getRow(i);
			emailid=row.getCell(0).getStringCellValue();
			password=row.getCell(1).getStringCellValue();
			enteremailId(emailid);
			enterpassword(password);
			clicksignin();
			captureinvaliderror();
			String actual = captureinvaliderror();
			String expected = "Invalid email or password.";
			int cellcount= sheet.getRow(i).getLastCellNum();
			XSSFCell cell= row.createCell(cellcount);
			if(actual.equals(expected))
			{
				System.out.println("TC passed");
				cell.setCellValue("passed");
			}
			else
			{
				System.out.println("TC not passed");
				cell.setCellValue("failed");
			}
			fs.close();
			FileOutputStream fout=new FileOutputStream("F:\\Book1.xlsx");
			workbook.write(fout);
		fout.close();
		}
		
	}
	public static void validatewithinvalid() throws IOException
	{
		/*launchchrome("https://cucumber.io/");
		clickloginbutton();
		FileInputStream fs = new FileInputStream("F:\\Book1.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fs);
		XSSFSheet sheet = workbook.getSheetAt(0);
		XSSFRow row=sheet.getRow(1);
		XSSFCell mailidcell= row.getCell(0);
		String mailid=mailidcell.getStringCellValue();
		XSSFCell passwordcell= row.getCell(1);
		String password=passwordcell.getStringCellValue();
		enteremailId(mailid);
		enterpassword(password);
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
		}*/
		
		launchchrome("https://cucumber.io/");
		clickloginbutton();
		String path="F:\\\\Book1.xlsx";
		String mailid= xcelutils.insertdata(path, 0, 1, 0);
		String password=xcelutils.insertdata(path, 0, 1, 1);
		enteremailId(mailid);
		enterpassword(password);
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



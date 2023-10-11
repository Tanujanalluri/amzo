package excelutilss;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class xcelutils {

	public static String insertdata(String path,int sheetid,int rowid,int cellid) throws IOException
	{
		
		FileInputStream fs = new FileInputStream(path);
		XSSFWorkbook workbook = new XSSFWorkbook(fs);
		XSSFSheet sheet = workbook.getSheetAt(sheetid);
		XSSFRow row=sheet.getRow(rowid);
		XSSFCell cell= row.getCell(cellid);
		String cellval=cell.getStringCellValue();
		return cellval;
	}
	public static void main(String[] args) {
		

	}

}

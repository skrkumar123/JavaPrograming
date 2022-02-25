package Excelutility;


import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Readdata {

	public static String getdata(String path, int row ,int coulum)
	{
			String data="";
		try {
			FileInputStream fis=new FileInputStream(path);
			XSSFWorkbook wb= new XSSFWorkbook(fis);
			XSSFSheet sheet=wb.getSheetAt(1);
			data=sheet.getRow(row).getCell(coulum).getStringCellValue();
			
			
			
			
		} catch (Exception e) {
			System.out.println(e);
		}
		return data;
		
		
	}
	
	
	public static void main(String[] args) {
		
		String path="C:\\Users\\Sonu\\eclipse-workspace\\12July_newBatch\\Testdata\\testdata.xlsx";
		String out1=getdata(path, 2, 2);
		System.out.println(out1);
		
	}
}

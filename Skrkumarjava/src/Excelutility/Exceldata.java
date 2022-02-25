package Excelutility;

import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class Exceldata {

	public static String getdata(String path,int row,int colum)
	{
		
		String data="";
		  try {
		FileInputStream fis=new FileInputStream(path);
	    XSSFWorkbook wb=new XSSFWorkbook(fis);
	    XSSFSheet sheet= wb.getSheetAt(0);
	    data=sheet.getRow(row).getCell(colum).getStringCellValue();
		
	} 
		  catch (Exception e)
		  {
	
		e.printStackTrace();
	  }
		return data;
		
	}
	

	public static void main(String[] args) {
		
		String path="C:\\Users\\Sonu\\eclipse-workspace\\12July_newBatch\\Testdata\\testdata.xlsx";
		
		for(int i=1;i<=19;i++)
		{
			String out1 = getdata(path, i, 1);
			System.out.println(out1);
}
		for(int i=1;i<=19;i++)
		{
			 
			String out1 = getdata(path, i, 0);
			System.out.println(out1);
		}
		
		
		
		
		
}}
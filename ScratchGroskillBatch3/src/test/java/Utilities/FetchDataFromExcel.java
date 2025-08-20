package Utilities;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import ConstantData.ConstantsDataPath;

public class FetchDataFromExcel {
	
	
	public static String getValueExcel(int x,int y) throws IOException
	{
		FileInputStream fs=new FileInputStream(ConstantsDataPath.EXCELPATH);
		XSSFWorkbook wb=new XSSFWorkbook(fs);
		XSSFSheet sheet=wb.getSheetAt(0);
		XSSFCell cellvalue= sheet.getRow(x).getCell(y);
		String value=cellvalue.toString();
		return value;
		
		
	}

	
	public static void setValueExcel(int rowIdx, int colIdx, String data) throws IOException {
	    FileInputStream fs = new FileInputStream(ConstantsDataPath.EXCELPATH);
	    XSSFWorkbook wb = new XSSFWorkbook(fs);
	    XSSFSheet sheet = wb.getSheetAt(0);

	  	    XSSFRow row = sheet.getRow(rowIdx);
	    if (row == null) {
	        row = sheet.createRow(rowIdx);
	    }

	   
	    XSSFCell cell = row.getCell(colIdx);
	    if (cell == null) {
	        cell = row.createCell(colIdx);
	    }

	 
	    cell.setCellValue(data);

	    fs.close(); 

	   
	    FileOutputStream fos = new FileOutputStream(ConstantsDataPath.EXCELPATH);
	    wb.write(fos);
	    fos.close();

	    wb.close(); // 
	}

}

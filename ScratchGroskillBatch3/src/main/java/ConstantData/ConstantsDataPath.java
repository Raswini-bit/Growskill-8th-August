package ConstantData;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ConstantsDataPath {
	static String timestamp=new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss").format(new Date());
	
	public static String PROPFILEPATH="src\\main\\java\\Global.Properties";
	public static String EXCELPATH="src\\main\\java\\TestData\\Book1.xlsx";
	public static String EXTENTREPORTPATH="test-output/ExtentReport.html";

}

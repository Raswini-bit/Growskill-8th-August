package Utilities;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import ConstantData.ConstantsDataPath;

public class FetchDataFromProperty {
	static FileReader reader;
	public static Properties readDataFromProperty()
	{

		try {
			reader = new FileReader(ConstantsDataPath.PROPFILEPATH);
		} catch (FileNotFoundException e) {

		}
		Properties prop=new Properties();
		try {
			prop.load(reader);
		} catch (IOException e) {

		}
		return prop;
	}

}

package Utilities;

import java.sql.SQLException;
import java.util.LinkedHashMap;
import java.util.Map;

public class ReturnDataFromDB {
	public static  String getValueFromDB() throws SQLException
	{

	Map<String,Object> mp=new LinkedHashMap<String,Object>();
	mp.put("id",FetchDataFromDB.DbConnection(1));
	mp.put("name",FetchDataFromDB.DbConnection(2));
	mp.put("salary",FetchDataFromDB.DbConnection(3));
	mp.put("hiredate",FetchDataFromDB.DbConnection(4));
	
	Object Id=mp.get("id");
	String id=Id.toString();
	return id;
	
	}


}

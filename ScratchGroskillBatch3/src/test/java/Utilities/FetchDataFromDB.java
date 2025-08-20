package Utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FetchDataFromDB {
	public static Object DbConnection(int x) throws SQLException
	{
		Connection con=null;
		Statement myst=null;
		ResultSet myrs=null;
		Object obj=null;
		
	con=	DriverManager.getConnection("jdbc:mysql://localhost:3306/julydemo","root","143@Mummy");
		
		
	myst=con.createStatement();	
	
	myrs=	myst.executeQuery("select * from raswini.employee");
	
	while(myrs.next())
	{
		obj=myrs.getString(x);
	}
	
		return obj;

	

}
}

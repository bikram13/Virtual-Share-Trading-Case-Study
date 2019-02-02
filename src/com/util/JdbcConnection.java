package com.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcConnection 
{
	public static Connection getConnection()
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} 
		
		catch (ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		
		Connection con = null;
		try
		{
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
			if(con!=null)
			{
				System.out.println("Connected");
			}
		}
		
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		
		return con;
	}
}

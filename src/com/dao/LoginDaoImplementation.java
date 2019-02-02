package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.dto.Login;
import com.util.JdbcConnection;

public class LoginDaoImplementation implements LoginDao
{
	public String validate(int regId, String password)
	{
		Connection con=null;
		con=JdbcConnection.getConnection();
		String query="select * from login where regId=? and password=?";
		PreparedStatement pst = null;
		String role=null;
		try 
		{
			pst=con.prepareStatement(query);
			pst.setInt(1, regId);
			pst.setString(2, password);
			
			ResultSet rs = pst.executeQuery();
			if(rs.next()==true)
			{
				role=rs.getString(3);
				return role;
			}
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				con.close();
			} 
			catch (SQLException e) 
			{
				e.printStackTrace();
			}
		}
		
		return role;
	}

	public boolean insertRecord(Login l)
	{
		Connection con=null;
		con=JdbcConnection.getConnection();
		PreparedStatement pst=null;
		String query="insert into login values(?,?,?)";
		try 
		{
			pst=con.prepareStatement(query);
			
			pst.setInt(1, l.getregId());
			pst.setString(2, l.getPassword());
			pst.setString(3, "user");
			
			int rec = pst.executeUpdate();
			
			if(rec==1)
			{
				return true;
			}
		} 
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		
		return false;
	}
}

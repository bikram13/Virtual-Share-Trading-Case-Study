package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.dto.Company;
import com.dto.UserDetails;
import com.util.JdbcConnection;

public class UserDetailsDaoImplementation implements UserDetailsDao
{
	public boolean insertRecord(UserDetails ud)
	{
		Connection con = null;
		con=JdbcConnection.getConnection();
		
		PreparedStatement pstmt = null;
		String query = "insert into Customers values(?,?,?,?,?,?,?)";
		
		try 
		{
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, ud.getRegId());
			pstmt.setString(2, ud.getName());
			pstmt.setLong(3, ud.getMobileNo());
			pstmt.setString(4, ud.getEmailId());
			pstmt.setString(5, ud.getPassword());
			pstmt.setInt(6, 100000);
			pstmt.setString(7, "Active");
			
			int rec = pstmt.executeUpdate();
			
			if(rec == 1)
			{
				return true;
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
		return false;
	}

	public boolean displayRecord(Company c)
	{
		Connection con =null;
		con = JdbcConnection.getConnection();
		
		PreparedStatement pstmt = null;
		String query = "select * from company";
		
		try 
		{
			pstmt = con.prepareStatement(query);
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next())
			{
				pstmt.setInt(1, c.getCompanyId());
				pstmt.setString(2, c.getCompanyName());
				pstmt.setInt(3, c.getNumberOfShares());
				pstmt.setFloat(4, c.getPriceOfShare());
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
		
		return false;
	}
}

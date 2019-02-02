package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.dto.Company;
import com.util.JdbcConnection;

public class AdminDaoImplementation implements AdminDao
{
	public boolean insert(Company c) 
	{
		Connection con = null;
		con=JdbcConnection.getConnection();
		
		PreparedStatement pstmt = null;
		String query = "insert into Company values(?,?,?,?)";
		
		try 
		{
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, c.getCompanyId());
			pstmt.setString(2, c.getCompanyName());
			pstmt.setInt(3, c.getNumberOfShares());
			pstmt.setFloat(4, c.getPriceOfShare());
			
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

	public boolean update(Company c) 
	{
		Connection con = null;
		con=JdbcConnection.getConnection();
		
		PreparedStatement pstmt = null;
		String query = "update Company set numberOfShares = ?,priceOfShare = ? where companyId=?";
		
		try 
		{
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, c.getNumberOfShares());
			pstmt.setFloat(2, c.getPriceOfShare());
			pstmt.setInt(3, c.getCompanyId());
			
			System.out.println(c.getCompanyId());
			
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
}
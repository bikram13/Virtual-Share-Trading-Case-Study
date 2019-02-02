package com.control;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.util.JdbcConnection;

public class UpdateUserDetailsServlet extends HttpServlet 
{
	private static final long serialVersionUID = 1L;

    public UpdateUserDetailsServlet()
    {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException
	{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		Connection con =null;
		con = JdbcConnection.getConnection();
		
		int m_regId = Integer.parseInt(request.getParameter("regId"));
		String m_status = request.getParameter("status");
		String m_password = request.getParameter("password");
		
		PreparedStatement pstmt = null;
		PreparedStatement pstmt1 = null;
		
		String query = "update customers set status = ?,password = ? where regId= ?";
		String query1 = "update login set password = ? where regId= ?"; 
		try
		{
			pstmt = con.prepareStatement(query);
			pstmt1 = con.prepareStatement(query1);
			pstmt.setInt(3, m_regId);
			pstmt.setString(1, m_status);
			pstmt.setString(2, m_password);
			pstmt1.setInt(2, m_regId);
			pstmt1.setString(1, m_password);
			
			int rec = pstmt.executeUpdate();
			int rec1=pstmt1.executeUpdate();
			
			if(rec == 1)
			{
				out.println("<body background='stock-market-invest.jpg'>");
				out.println("<h1><font color='red'>UPDATED!</font></h1>");
				out.println("<a href='AdminHome.jsp' style='color: red;'>HOME</a>");
				out.println("</body>");
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
	}
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}

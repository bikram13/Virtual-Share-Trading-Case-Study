
package com.control;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.util.JdbcConnection;

public class DisplayUserShareServlet extends HttpServlet 
{
	private static final long serialVersionUID = 1L;

    public DisplayUserShareServlet() 
    {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException
	{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		Connection con =null;
		con=JdbcConnection.getConnection();
		
		PreparedStatement pstmt = null;
		String query = "select * from company order by companyId";
		
		out.println("<html>");
		out.println("<head>");
		out.println("<link href='Table.css' rel='stylesheet' type='text/css'/>");
		out.println("</head>");
		out.println("<body background='stock-market-invest.jpg'>");
		out.println("<h1 text align='center'>SHARE DETAILS</h1><br><br>");
		out.println("<table id='keywords' border='3' width='400' height='250' align='center' bgcolor='salmon'>");
		
		try 
		{
			pstmt = con.prepareStatement(query);
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next())
			{
				out.println("<tr>");
				out.println("<td class='lalign'>"+rs.getInt(1)+"</td>");
				out.println("<td>"+rs.getString(2)+"</td>");
				out.println("<td>"+rs.getInt(3)+"</td>");
				out.println("<td>"+rs.getInt(4)+"</td>");
				out.println("</tr>");
			}
			
			out.println("</table>");
			out.println("<form action='PurchaseShares.jsp' method='post' align='center'>");
			out.println("<b><font color='red'>Click Here To Purchase</font></b><button class='w3-button w3-light-grey w3-block'>Purchase</button>");
			out.println("</form>");
			out.println("</body>");
			out.println("</html>");
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
}

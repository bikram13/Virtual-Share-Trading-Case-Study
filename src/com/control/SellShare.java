package com.control;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.util.JdbcConnection;

public class SellShare extends HttpServlet
{
	private static final long serialVersionUID = 1L;
       
	public SellShare()
	{
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException 
	{
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		try 
		{
			Connection con= null;
			con=JdbcConnection.getConnection();
			
			HttpSession hs = request.getSession();
			
			String id=(String)hs.getAttribute("regid");
			int regid=Integer.parseInt(id);
			String cid=request.getParameter("compid");
			System.out.println("string" +cid);
			int compId=Integer.parseInt(cid);
			System.out.println("parsed"+compId);
			int numOfShare=Integer.parseInt(request.getParameter("sharenum"));
		
			
			CallableStatement cst=null;

			cst=con.prepareCall("{call selltransaction(?,?,?)}");
			cst.setInt(1, regid);
			cst.setInt(2, compId);
			cst.setInt(3, numOfShare);
			
			cst.executeQuery();
			out.println("<body background='stock-market-invest.jpg'>");
			out.println("<h1><font color='red'>SOLD!</font></h1>");
			out.println("<a href='UserHome.jsp' style='color: red'>HOME</a>");
			out.println("</body>");
		} 
		catch (SQLException e)
		{
			e.printStackTrace();
		}
	}
}

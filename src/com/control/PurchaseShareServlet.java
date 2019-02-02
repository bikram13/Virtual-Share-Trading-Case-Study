
package com.control;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.util.JdbcConnection;

public class PurchaseShareServlet extends HttpServlet
{
	private static final long serialVersionUID = 1L;
       
    public PurchaseShareServlet()
    {
        super();
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException 
	{
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		Connection con= null;
		CallableStatement cst=null;
		try 
		{
			
			
			con=JdbcConnection.getConnection();
			
			HttpSession hs = request.getSession();
			
			String id=(String)hs.getAttribute("regid");
			System.out.println(id);
			int regid=Integer.parseInt(id);
			int compId=Integer.parseInt(request.getParameter("companyId"));
			int numOfShare=Integer.parseInt(request.getParameter("numberOfShares"));
			/*System.out.println(regid);
			System.out.println(compId);
			System.out.println(numOfShare);*/
			

			cst=con.prepareCall("{call purchasetransaction(?,?,?)}");
			cst.setInt(1, regid);
			cst.setInt(2, compId);
			cst.setInt(3, numOfShare);
			ResultSet rs=cst.executeQuery();
			
			/*out.println("<body background='stock-market-invest.jpg'>");
			out.println("<h1><font color='red'>PURCHASED!</font></h1>");
			out.println("<a href='UserHome.jsp' style='color: red'>HOME</a>");
			out.println("</body>");*/
			
			if (rs!=null) {
				request.getRequestDispatcher("Purchased.jsp").forward(request, response);
			} else {
				request.getRequestDispatcher("PurchaseFailed.jsp").forward(request, response);
			}
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		finally {
			
			try {
				cst.close();
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

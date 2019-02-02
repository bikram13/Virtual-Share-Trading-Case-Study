
package com.control;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.LoginDao;
import com.dao.LoginDaoImplementation;
import com.dao.UserDetailsDao;
import com.dao.UserDetailsDaoImplementation;
import com.dto.Login;
import com.dto.UserDetails;
import com.util.JdbcConnection;

public class InsertUserServlet extends HttpServlet
{
	private static final long serialVersionUID = 1L;

    public InsertUserServlet()
    {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException 
	{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		Connection con = JdbcConnection.getConnection();

		int m_regId = Integer.parseInt(request.getParameter("regId"));
		String m_name = request.getParameter("name");
		long m_mobileNo = Long.parseLong(request.getParameter("mobileNo"));
		String m_emailId = request.getParameter("emailId");
		String m_password = request.getParameter("password");
		
		UserDetails ud = new UserDetails(m_regId,m_name,m_mobileNo,m_emailId,m_password);
		UserDetailsDao udao = new UserDetailsDaoImplementation();
		
		if(udao.insertRecord(ud))
		{
			request.getRequestDispatcher("Success.jsp").forward(request, response);
			/*out.println("<body background='stock-market-invest.jpg'>");
			out.println("<h1><font color='red'>REGISTERED SUCCESSFULLY!</font></h1>");
			out.println("<form action='LogOut'><input type='submit' value='Login'></form>");
			out.println("</body>");*/
		}
		else
		{
			request.getRequestDispatcher("Fail.jsp").forward(request, response);
			/*out.println("<body background='stock-market-invest.jpg'>");
			out.println("<h1><font color='red'>SORRY! CANNOT BE REGISTERED</font></h1>");
			out.println("<form action='LogOut'><input type='submit' value='Logout'></form>");
			out.println("</body>");*/
		}
		
		Login l = new Login(m_regId, m_password);
		LoginDao ldao = new LoginDaoImplementation();
		
		ldao.insertRecord(l);
		
	}
}

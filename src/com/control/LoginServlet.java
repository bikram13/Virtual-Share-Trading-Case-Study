
package com.control;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.LoginDao;
import com.dao.LoginDaoImplementation;

public class LoginServlet extends HttpServlet
{
	private static final long serialVersionUID = 1L;
       
    public LoginServlet()
    {
        super();
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException
	{
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String id=request.getParameter("regId");
		int m_regId=Integer.parseInt(id);
		String m_password=request.getParameter("password");
	
		LoginDao ldao=new LoginDaoImplementation();
		String role=ldao.validate(m_regId, m_password);
		
		if(role.equals("admin"))
		{
			out.println("Admin Logged in ");
		
			RequestDispatcher rd = request.getRequestDispatcher("AdminHome.jsp");
			rd.forward(request, response);
		}
		
		else if(role.equals("user"))
		{
			out.println("User Logged in ");
			
			RequestDispatcher rd = request.getRequestDispatcher("UserHome.jsp");
			
			HttpSession hs=request.getSession();
			hs.setAttribute("regid", id);
			rd.forward(request, response);
		}
		
		else
		{
			response.sendRedirect("Login.jsp");
		}
	}
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
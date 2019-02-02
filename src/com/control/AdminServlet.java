package com.control;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class AdminServlet extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
 
    public AdminServlet() 
    {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException 
	{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		int m_regId = Integer.parseInt(request.getParameter("regId"));
		String m_password = request.getParameter("password");
		
		HttpSession session = request.getSession();
		session.setAttribute("s_username", m_regId);
		
		out.println("<html>");
		out.println("<body bgcolor='#D3D3D3'>");
		out.println("<h1 text align='center'>Welcome to Admin Page!!!</h1> ");
		out.println("<a href='DisplayServlet'><h3>1.DISPLAY</h3></a><br><br>");
		out.println("<a href='InsertShare.jsp'><h3>2.INSERT</h3></a><br><br>");
		out.println("<a href='UpdateShare.jsp'><h3>3.UPDATE</h3></a><br><br>");
		out.println("<a href='UpdateUserDetails.jsp'><h3>3.UPDATE USER DETAILS</h3></a><br><br>");
		out.println("<form action='LogOut'><input type='submit' value='Logout'></form>");
		out.println("</body>");
		out.println("</html>");
	}
}

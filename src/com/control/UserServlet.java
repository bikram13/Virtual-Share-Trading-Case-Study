package com.control;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class UserServlet extends HttpServlet 
{
	private static final long serialVersionUID = 1L;

    public UserServlet() 
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
		
		out.println("</body>");
		out.println("</html>");

	}
}

package com.control;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.AdminDao;
import com.dao.AdminDaoImplementation;
import com.dto.Company;

public class UpdateShareServlet extends HttpServlet
{
	private static final long serialVersionUID = 1L;
  
    public UpdateShareServlet()
    {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException 
	{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		int m_companyId = Integer.parseInt(request.getParameter("companyId"));
		int m_numberOfShares = Integer.parseInt(request.getParameter("numberOfShares"));
		float m_priceOfShare = Float.parseFloat(request.getParameter("priceOfShare"));
		
		Company c = new Company(m_companyId,m_numberOfShares,m_priceOfShare);
		AdminDao ad = new AdminDaoImplementation();
		
		if(ad.update(c))
		{
			out.println("<body background='stock-market-invest.jpg'>");
			out.println("<h1><font color='red'>UPDATED!</font></h1>");
			out.println("<a href='AdminHome.jsp' style='color: red;'>HOME</a>");
			out.println("</body>");
		}
		
		else
		{
			out.println("<body background='stock-market-invest.jpg'>");
			out.println("<h1><font color='red'>SORRY! CANNOT BE UPDATED!</font></h1>");
			out.println("<a href='AdminHome.jsp' style='color: red;'>HOME</a>");
			out.println("</body>");
		}
	}
}
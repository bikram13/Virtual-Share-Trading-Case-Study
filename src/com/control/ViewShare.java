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
import javax.servlet.http.HttpSession;

import com.util.JdbcConnection;

public class ViewShare extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
       
	public ViewShare() 
	{
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException
	{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		try 
		{
			Connection con = JdbcConnection.getConnection();
			PreparedStatement pst=null;
			
			HttpSession hs = request.getSession();
			
			String id=(String)hs.getAttribute("regid");
			System.out.println(id);
			int reid=Integer.parseInt(id);
			String view="select c.companyname, t.numofshares, t.totalprice, c.companyid, c.priceofshare from transaction t, company c where t.regid=? and c.companyid=t.companyid and t.ttype='p'";
			
			pst=con.prepareStatement(view);
			pst.setInt(1, reid);
			out.println("<html>");
			out.println("<head>");
			out.println("<link href='Table.css' rel='stylesheet' type='text/css'/>");
			out.println("</html>");
			out.println("<body background='stock-market-invest.jpg'> <div class='container'> <section id='content'>");
			ResultSet rs = pst.executeQuery();
			out.println("<table id='keywords' border=6 bgcolor='salmon'>");
			out.println("<th><b> &nbsp;Company Name&nbsp; </b></th>");
			out.println("<th><b> &nbsp;Shares purchased&nbsp; </b></th>");
			out.println("<th><b> &nbsp;Total Investment &nbsp;</b></th>");
			out.println("<th><b> &nbsp;Price Of Share &nbsp;</b></th>");
			out.println("<th><b> &nbsp; No. of shares to be sold &nbsp; </b></th>");
			while(rs.next())
			{
				if(rs.getInt(2)>0)
				{
					out.println("<tr>");
					out.println("&nbsp;");
					out.println("<form action='SellShare'>");
					out.println("<td class='lalign'>"+rs.getString(1)+"</td>");
					out.println("<td>"+rs.getString(2)+"</td>");
					out.println("<td>"+rs.getString(3)+"</td>");
					out.println("<td>"+rs.getString(5)+"</td>");
					out.println("<input type='hidden' name='compid' value='"+rs.getInt(4)+"'>");
					out.println("<td><input type='text' class='w3-input' name='sharenum'></td>");
					out.println("<td><button class='w3-button w3-light-grey w3-block'>Sell</button></form></td>");
					out.println("</tr>");
				}
				
				else
				{
					out.println("<body bgcolor='#D3D3D3'>");
					out.println("<h1><font color='black'>SHARES NOT AVAILABLE!</font></h1>");
				}
			}
			out.println("</table>");
			out.print("</section></div></body></html>");
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		} 
	}
}

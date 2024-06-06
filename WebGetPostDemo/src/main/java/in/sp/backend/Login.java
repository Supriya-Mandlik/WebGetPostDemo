package in.sp.backend;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/mylogin")
public class Login extends HttpServlet
{
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
	
		String myemail = (String) req.getParameter("name1");
		String mypass = (String) req.getParameter("pass1");
		
		if (myemail.equals("deepak@gmail.com") && mypass.equals("deepak123"))
		{
			System.out.println("Success");
		} else 
		{
            System.out.println("Failed");
		}
		
	}
	
	/*@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
	
		String myemail = (String) req.getParameter("name1");
		String mypass = (String) req.getParameter("pass1");
		
		if (myemail.equals("deepak@gmail.com") && mypass.equals("deepak123"))
		{
			System.out.println("Success");
		} else 
		{
            System.out.println("Failed");
		}
		
	}*/
	
	/*@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
	
		String myemail = (String) req.getParameter("name1");
		String mypass = (String) req.getParameter("pass1");
		
		if (myemail.equals("deepak@gmail.com") && mypass.equals("deepak123"))
		{
			System.out.println("Success");
		} else 
		{
            System.out.println("Failed");
		}
		
	}*/

}

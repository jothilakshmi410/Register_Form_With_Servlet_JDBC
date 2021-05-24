package net.javaguides.registration.controller;
import net.javaguides.registration.dao.*;
import net.javaguides.registration.model.Employeee;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EmployeeeServlet
 */
@WebServlet("/EmployeeeServlet")
public class EmployeeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    private EmployeeeDao employeeeDao = new EmployeeeDao();
	/**
     * @see HttpServlet#HttpServlet()
     */
    public EmployeeeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/jsp/RegisterForm.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
		int registerFormID = 0;
		
		String strID=request.getParameter("id");
		String strfname=request.getParameter("first_name");
		String strlname=request.getParameter("last_name");
		
		String strUname=request.getParameter("username");
		String strPwd=request.getParameter("password");
		String strAddress=request.getParameter("address");
		
		if(!strID.isEmpty() && !strfname.isEmpty()&& !strlname.isEmpty() && !strUname.isEmpty() && 
                !strPwd.isEmpty() && !strAddress.isEmpty())
        {

			int ID =Integer.parseInt(request.getParameter("id"));
			Employeee employeee = new Employeee();
			
			employeee.setStrid(ID);
			employeee.setFirst_name(strfname);
			employeee.setLast_name(strlname);
			employeee.setUsername(strUname);
	        employeee.setPassword(strPwd);
	        employeee.setAddress(strAddress);
	
				try 
					{
						registerFormID = employeeeDao.registerEmployeee(employeee);
					} 
				catch (ClassNotFoundException e) 
						{
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
				if(registerFormID > 0) 
					{
						request.setAttribute("id",employeee.getStrid());
						request.setAttribute("first_name",employeee.getFirst_name());
						request.setAttribute("last_name",employeee.getLast_name());
						request.setAttribute("username",employeee.getUsername());
						request.setAttribute("password",employeee.getPassword());
						request.setAttribute("address",employeee.getAddress());
			
						RequestDispatcher dispatcher = request.getRequestDispatcher("/jsp/RegisterFinal.jsp");
						dispatcher.forward(request, response);
					
					}
			
			
	}
		else
        {
            RequestDispatcher dispatcher=request.getRequestDispatcher("/jsp/RegisterFailed.jsp");
            dispatcher.forward(request, response);
        }
	}
	}


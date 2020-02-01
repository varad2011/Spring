package com.registrationTablejdbc;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Login")
public class LoginAction extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public LoginAction() {
        super();
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		RegistrationTablejdbc sqlTable = new RegistrationTablejdbc();
		PrintWriter out =  response.getWriter();
		String name = request.getParameter("userName");
		String password = request.getParameter("password");
		if((name.isEmpty()) && (password.isEmpty())) {
			response.sendRedirect("UserIsNotAvailable.jsp");
			
		}else {
			boolean checkLogin = sqlTable.checkStatus(name, password);
			if(checkLogin == true) {
				out.println("<h1> Login successfully" + "</h1>");
				out.close();
			}else {	
				response.sendRedirect("UserIsNotAvailable.jsp"); 
			}
		}
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}

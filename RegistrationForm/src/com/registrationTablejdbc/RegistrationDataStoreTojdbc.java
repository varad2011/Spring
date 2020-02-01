package com.registrationTablejdbc;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/registration")
public class RegistrationDataStoreTojdbc extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public RegistrationDataStoreTojdbc() {
        super(); 
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		RegistrationTablejdbc sqlTable = new RegistrationTablejdbc();
		String lastName = request.getParameter("lastName");
		String name =  request.getParameter("name");
		String gender = request.getParameter("gender");
		String password = request.getParameter("password");
		String emailId = request.getParameter("emailId");
		String mobileNumber = request.getParameter("mobileNumber");
		String address = request.getParameter("address");
		
		if((name.isEmpty())||(lastName.isEmpty())||(password.isEmpty())||(emailId.isEmpty())||(mobileNumber.isEmpty())||(address.isEmpty())) {
			response.sendRedirect("BlankUserDetails.jsp");
			return;
		}else {
			boolean availabiltyCheck = sqlTable.userAvailableCheckStatus(name);
			if(availabiltyCheck == false) {
				sqlTable.StoreTojdbc(name, lastName, password, gender, emailId, mobileNumber, address);
				response.sendRedirect("SuccessfullyRegistration.jsp");
			}else {
				response.sendRedirect("unsuccessfullLogin.jsp");
			}
		}
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}

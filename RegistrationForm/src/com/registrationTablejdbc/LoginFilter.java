package com.registrationTablejdbc;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

@WebFilter("")
public class LoginFilter implements Filter {

    public LoginFilter() {
       
    }

	public void destroy() {
		
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest request1 = (HttpServletRequest)request;
		String name = request.getParameter("userName");
		String password = request.getParameter("password");
		if((name.isEmpty()) && (password.isEmpty())) {
			
		}else {
				chain.doFilter(request, response);
			}
		
	}

	public void init(FilterConfig fConfig) throws ServletException {
		
	}

}

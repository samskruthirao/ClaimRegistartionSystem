package com.cg.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cg.dao.ILoginDAO;
import com.cg.dao.LoginDAOImpl;
import com.cg.service.UserroleDto;

@WebServlet("/Login")
public class LoginController extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ILoginDAO loginDAO = new LoginDAOImpl();
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		UserroleDto user = new UserroleDto(username, password);
		//System.out.println(user);
		boolean isValidUser = loginDAO.validate(user);
		//System.out.println(isValidUser);
		String roleCode = loginDAO.getRoleCode(user);
		//System.out.println(roleCode);

		if(isValidUser) {
			//System.out.println(roleCode);
			
			switch (roleCode) {
			case "CLAIM ADJUSTER": 
				response.sendRedirect("adminPage.html");
				break;
			case "CLAIM HANDLER":
				response.sendRedirect("agentPage.html");
				break;
			case "INSURED":
				//System.out.println("I am insured");
				response.sendRedirect("InsuredPage.html");
				break;
			default:
				break;
			}
			
		}else {
			response.sendRedirect("index.html?errorMsg=Username or Password Wrong");
		}
	}
}
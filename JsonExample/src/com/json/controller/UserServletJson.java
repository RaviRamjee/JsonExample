package com.json.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.google.gson.stream.JsonWriter;
import com.json.bean.User;

@WebServlet("/UserServletJson")
public class UserServletJson extends HttpServlet {
	private static final long serialVersionUID = 1L;
	UserService service=new UserService(); 
 
    public UserServletJson() {
        super();
      
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		
		response.setContentType("application/json");
		response.setCharacterEncoding("UTF-8");
		
		List<User> user=new ArrayList();
		user=service.getUsers();
		
		Gson gson=new Gson();
		String json=gson.toJson(user);
		System.out.println(json);
		
		PrintWriter out=response.getWriter();
		out.print(json);
		
		
		
	}

	
	

}

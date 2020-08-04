package com.json.controller;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.json.bean.User;

public class Test {

	public static void main(String[] args) {
		List<User> user=new ArrayList();
		UserService service=new UserService(); 
		user=service.getUsers();
		
		Gson gson=new Gson();
		String json=gson.toJson(user);
		
	    System.out.println(json);
	}

}

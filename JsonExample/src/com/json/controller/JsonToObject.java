package com.json.controller;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.json.bean.User;

public class JsonToObject {

	public static void main(String[] args) {
		UserService service=new UserService(); 
		
		User user=service.getUsers().get(0);
		
		Gson json=new Gson();
		String s=json.toJson(user);
		System.out.println(s);
		User user1= json.fromJson(s, User.class);
		System.out.println(user1.getClass().getSimpleName());
		

	}

}

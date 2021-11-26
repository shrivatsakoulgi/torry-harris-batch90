
package com.torryharris.controller;
import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.torryharris.model.User;

@Controller
public class LoginCotroller {
	
	private static ArrayList<User> userList;
	static{
		userList = new ArrayList<User>();
	}

	@RequestMapping("/login")
	public ModelAndView login(@RequestParam("user") String userName,
			@RequestParam("password") String password){
		boolean loginStatus=false;
		for(User user:userList){
		if(userName.equals(user.getUserName()) && 
				password.equals(user.getPassword())){
			loginStatus=true;
			break;
			} 
		}
		ModelAndView mv = new ModelAndView();
		mv.setViewName("response.jsp");
		mv.addObject("status", loginStatus);
		if(loginStatus){
			mv.addObject("username",userName);
		}
		return mv;
	}
	
	@RequestMapping("/register")
	
	public ModelAndView register(@RequestParam("fname") String fName,
			@RequestParam("lname") String lName,
			@RequestParam("username") String userName,
			@RequestParam("password1") String password,
			@RequestParam("age") int age )
			{
	
		User user = new User(fName,lName,userName,password,age);
		userList.add(user);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("index.jsp");
		
		mv.addObject("message", "Registration Success !! "
				+ "Login to continue");
		System.out.println(user);
		return mv;
	}
}

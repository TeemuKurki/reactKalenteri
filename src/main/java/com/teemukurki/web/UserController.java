package com.teemukurki.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.teemukurki.domain.User;
import com.teemukurki.domain.UserRepository;


@RestController
public class UserController {
	@Autowired
	UserRepository urepo;

	@RequestMapping(value="/user", method = RequestMethod.GET)
	public @ResponseBody Object printUser(){
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		System.out.print("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!"+ auth);
		return auth;
	}
}

package com.teemukurki.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.teemukurki.domain.Event;
import com.teemukurki.domain.EventRepository;
import com.teemukurki.domain.User;
import com.teemukurki.domain.UserRepository;


@RestController
public class UserController {
	@Autowired
	UserRepository urepo;
	@Autowired
	EventRepository erepo;

	@RequestMapping(value="/user", method = RequestMethod.GET)
	public @ResponseBody User printUser(){
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		return urepo.findByUsername(auth.getName());
	}
	
	@RequestMapping(value="/add", method = RequestMethod.POST)
	public void addEvent(@RequestBody Event e1){
		Event ev = new Event(e1.getTitle(), e1.getDate(), e1.getDesc(), e1.getName(), urepo.findByUsername(e1.getName()));
		erepo.save(ev);
		
	}
}

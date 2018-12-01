package com.pfe.gestion.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.pfe.gestion.entities.User;
import com.pfe.gestion.service.UserService;

@Controller
public class PfeController {
	@Autowired
	private UserService userService;

    @Autowired
    public PfeController(UserService userService) {
        this.userService = userService;
        }
	@RequestMapping(value="/ConsulterProfil/{id}", method=RequestMethod.GET)
	public User Consulter(@PathVariable("id")Long id) {
		 return userService.consulterProfil(id);
	                
	}
	
	
}

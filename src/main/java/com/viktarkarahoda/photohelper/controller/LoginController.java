package com.viktarkarahoda.photohelper.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.SpringProperties;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.viktarkarahoda.photohelper.entity.User;
import com.viktarkarahoda.photohelper.service.UserService;
import com.viktarkarahoda.photohelper.viewBean.LoginBean;

@Controller
//!!!//
//@Import(value = { LoginSecurityConfig.class })
//!!!!//
public class LoginController {
//	@RequestMapping("/login")
//	public ModelAndView init() {
//		return new ModelAndView("login");
//	}

	@Autowired
	private UserService userService;
	
//	@RequestMapping(value = { "/profile"})
//    public ModelAndView profile(HttpServletRequest request, HttpServletResponse response) {
//        ModelAndView model = new ModelAndView();
//        model.setViewName("profile");
//        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
//        String userName = authentication.getName();
//        model.addObject("name", userName);
//        return model;
//    }
	
	
	
	
	@RequestMapping(value="/logout", method = RequestMethod.GET)
	public String logoutPage (HttpServletRequest request, HttpServletResponse response) {
	    Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    if (auth != null){    
	        new SecurityContextLogoutHandler().logout(request, response, auth);
	    }
	    return "redirect:/login?logout";//You can redirect wherever you want, but generally it's a good practice to show login screen again.
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView displayLogin(HttpServletRequest request, HttpServletResponse response)  throws ServletException, IOException{
		ModelAndView model = new ModelAndView("login");

        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String userName = authentication.getName();
//        model.addObject("name", userName);
        HttpSession sess = request.getSession(true);
        sess.setAttribute("name", userName);
		return model;
	}

}

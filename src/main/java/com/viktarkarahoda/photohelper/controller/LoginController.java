package com.viktarkarahoda.photohelper.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

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
	
	@RequestMapping(value = { "/profile"}, method = RequestMethod.GET)
    public ModelAndView profile(HttpServletRequest request, HttpServletResponse response) {
		HttpServletRequest reqt = (HttpServletRequest) request;
		HttpServletResponse resp = (HttpServletResponse) response;
        ModelAndView model = new ModelAndView();
        model.setViewName("profile");
    
        return model;
    }
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView displayLogin(HttpServletRequest request, HttpServletResponse response){
		ModelAndView model = new ModelAndView("login");
		LoginBean loginBean = new LoginBean();
		model.addObject("loginBean", loginBean);
		return model;
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ModelAndView executeLogin(HttpServletRequest request, HttpServletResponse response, @ModelAttribute("loginBean") LoginBean loginBean) {
		 
		ModelAndView model = null;
		try {
			boolean isValidUser = userService.isValidUser(loginBean.getUsername(), loginBean.getPassword());

			if (isValidUser) {
				request.setAttribute("loggedInUser", loginBean.getUsername());
				HttpServletRequest reqt = (HttpServletRequest) request;
				HttpServletResponse resp = (HttpServletResponse) response;
				model = new ModelAndView("profile");
		        model.setViewName("profile");
		        try {
					resp.sendRedirect(reqt.getContextPath() + "/profile");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} else {
				model = new ModelAndView("login");
				request.setAttribute("message", "Неправильные данные для входа!!");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	return model;
	}
}

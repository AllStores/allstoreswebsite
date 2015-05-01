package com.home.allstores.api.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.home.allstores.common.WebsiteConstants;

@Controller
public class HomeController
{
	@RequestMapping (value = {WebsiteConstants.INDEX_API_URL, WebsiteConstants.HOME_API_URL}, method = RequestMethod.GET)
	public ModelAndView handleHomeRequest(HttpServletRequest request, HttpServletResponse response)
	{
		ModelAndView mav = new ModelAndView();
		mav.setViewName(WebsiteConstants.HOME_VIEW_NAME);
		//mav.addObject(WebsiteConstants.JS_VERSION_STRING, WebsiteConstants.JS_VERSION_MAP);
		//mav.addObject(WebsiteConstants.CSS_VERSION_STRING, WebsiteConstants.CSS_VERSION_MAP);
		return mav;
	}
}

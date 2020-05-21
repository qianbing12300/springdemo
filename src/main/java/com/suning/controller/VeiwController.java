package com.suning.controller;

import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class VeiwController implements Controller {
    @Override
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        ModelAndView modelAndView = new ModelAndView("myView");
        modelAndView.addObject("name", "I am from suning!");
        return modelAndView;
    }

    public static void main(String[] args) {
        System.out.println(DispatcherServlet.class.getName() + ".CONTEXT");
    }
}

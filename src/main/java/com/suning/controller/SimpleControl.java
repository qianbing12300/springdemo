package com.suning.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

/**
 * 简单的springMvc demo, 实现Controller接口
 *
 * @author qianbing12300
 */
public class SimpleControl implements Controller {

    @Override
    public ModelAndView handleRequest(javax.servlet.http.HttpServletRequest httpServletRequest,
                                      javax.servlet.http.HttpServletResponse httpServletResponse) throws Exception {
        ModelAndView mv = new ModelAndView("/WEB-INF/page/userView.jsp");
        mv.addObject("name", "I am a good teacher!");
        return mv;
    }
}

package com.ola.webappEmpty.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
public class TestController {
    @RequestMapping("/test")
    @ResponseBody
    public String getTest(HttpServletRequest request){
        System.out.println(System.getProperty("/"));
        System.out.println(System.getProperty("user.dir"));
        System.out.println(request.getRequestURI());
        System.out.println(request.getSession().getServletContext().getRealPath("/"));
        return "test";
    }

    @RequestMapping("/test1")
    public ModelAndView testView(){
        ModelAndView modelAndView=new ModelAndView("test");
        modelAndView.setViewName("index");
        return modelAndView;
    }

    @RequestMapping("/adt")
    public ModelAndView adtTest(String ANI,String UserEvent){
        System.out.println(ANI);
        System.out.println(UserEvent);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("demo");
        modelAndView.addObject("ANI",ANI);
        modelAndView.addObject("UserEvent",UserEvent);

        return modelAndView;
    }
}

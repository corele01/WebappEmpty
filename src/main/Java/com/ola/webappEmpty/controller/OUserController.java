package com.ola.webappEmpty.controller;

import com.ola.webappEmpty.model.OUser;
import com.ola.webappEmpty.service.OUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
@RequestMapping("user")
public class OUserController {
    @Autowired
    private OUserService oUserService;

    /**
     * @param request
     * @return
     * */
    @RequestMapping(value = "login",method = RequestMethod.POST)
    public ModelAndView login(HttpServletRequest request, OUser oUser, HttpServletResponse response){
        ModelAndView modelAndView = new ModelAndView();

        OUser user = this.oUserService.login(oUser);
        if (user == null || user.getId() == null){
            modelAndView.setViewName("login");
            return modelAndView.addObject("msg","账号或密码错误！");
        }else{
            request.getSession().setAttribute("user",user);
            try {
                response.sendRedirect("/work/index.jsp");
            } catch (IOException e) {
                e.printStackTrace();
            }
            modelAndView.setViewName("work/index");
        }
        return null;
    }

    @RequestMapping("exit")
    public ModelAndView exit(HttpServletRequest request){
        request.getSession().invalidate();
        ModelAndView modelAndView = new ModelAndView("login");
        return modelAndView;
    }
}

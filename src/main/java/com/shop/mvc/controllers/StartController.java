package com.shop.mvc.controllers;

import com.shop.mvc.domain.UserDto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StartController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView start(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("main");
        return modelAndView;
    }

}

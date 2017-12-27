package com.shop.mvc.controllers;

import com.shop.mvc.domain.UserDto;
import com.shop.mvc.domain.dto.ComputerDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AdminController {

    @RequestMapping(value = "/administration", method = RequestMethod.GET)
    public ModelAndView getAdminPage(Model model){
        ModelAndView modelAndView = new ModelAndView();
        if(!model.containsAttribute("admin")){
            modelAndView.setViewName("login");
        }
        modelAndView.setViewName("admin");
        return modelAndView;
    }

    /////////////////////////////////////////////////////////////////////////////////
    @RequestMapping(value = "/addLaptop", method = RequestMethod.GET)
    public ModelAndView addLaptop(Model model){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("addLaptopPage");
        modelAndView.addObject("laptop",new ComputerDto());
        return modelAndView;
    }

    @RequestMapping(value = "/addMobilePhone", method = RequestMethod.GET)
    public ModelAndView addMobilePhone(Model model){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("addMobilePhonePage");
        return modelAndView;
    }

    @RequestMapping(value = "/addRacket", method = RequestMethod.GET)
    public ModelAndView addRacket(Model model){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("addRacketPage");
        return modelAndView;
    }

    @RequestMapping(value = "/addBall", method = RequestMethod.GET)
    public ModelAndView addBall(Model model){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("addBallPage");
        return modelAndView;
    }
    /////////////////////////////////////////////////////////////////////////////////

}

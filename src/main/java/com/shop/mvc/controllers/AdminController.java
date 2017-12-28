package com.shop.mvc.controllers;

import com.shop.mvc.domain.UserDto;
import com.shop.mvc.domain.dto.ComputerDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.Objects;

@Controller
public class AdminController {

    @RequestMapping(value = "/administration", method = RequestMethod.GET)
    public String getAdminPage(HttpSession session){
        UserDto admin = (UserDto) session.getAttribute("admin");
        if(Objects.isNull(admin)){
            return "redirect:/";
        }
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("admin");
        return "admin";
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

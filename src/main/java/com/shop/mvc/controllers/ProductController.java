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
public class ProductController {

   @RequestMapping(value = "/admin/addLaptop", method = RequestMethod.GET)
    public String addLaptop(HttpSession session, Model model){
        UserDto admin = (UserDto) session.getAttribute("admin");
        if(Objects.isNull(admin)){
            return "redirect:/";
        }
        if(!model.containsAttribute("laptop")){
            model.addAttribute("laptop",new ComputerDto());
        }
        return "addLaptopPage";
    }

    @RequestMapping(value = "/admin/addMobilePhone", method = RequestMethod.GET)
    public ModelAndView addMobilePhone(Model model){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("addMobilePhonePage");
        return modelAndView;
    }

    @RequestMapping(value = "/admin/addRacket", method = RequestMethod.GET)
    public ModelAndView addRacket(Model model){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("addRacketPage");
        return modelAndView;
    }

    @RequestMapping(value = "/admin/addBall", method = RequestMethod.GET)
    public ModelAndView addBall(Model model){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("addBallPage");
        return modelAndView;
    }


}

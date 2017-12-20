package com.shop.mvc.controllers;

import com.shop.mvc.domain.UserDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpSession;
import java.util.Objects;

@Controller
public class LoginController {

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public ModelAndView login(Model model){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("login");

        if(!model.containsAttribute("userDto")){
            model.addAttribute("userDto", new UserDto());
        }

        return modelAndView;
    }



}

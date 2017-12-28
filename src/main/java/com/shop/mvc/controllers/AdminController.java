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

    @RequestMapping(value = "/admin/main", method = RequestMethod.GET)
    public String getAdminPage(HttpSession session){
        UserDto admin = (UserDto) session.getAttribute("admin");
        if(Objects.isNull(admin)){
            return "redirect:/";
        }
        return "admin";
    }

    @RequestMapping(value = "/admin/logout", method = RequestMethod.GET)
    public String logout(HttpSession session){
        UserDto admin = (UserDto) session.getAttribute("admin");
//        UserDto user = (UserDto) session.getAttribute("user");

        if(Objects.isNull(admin)){
            return "redirect:/login";
        }

        session.removeAttribute("admin");
        return "redirect:/login";
//        if(Objects.isNull(user)){
//            session.removeAttribute("user");
//        }
    }


}

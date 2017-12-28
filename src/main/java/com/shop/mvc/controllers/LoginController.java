package com.shop.mvc.controllers;

import com.shop.mvc.domain.UserDto;
import com.shop.mvc.exceptions.PasswordErrorException;
import com.shop.mvc.exceptions.UserNotFindException;
import com.shop.mvc.service.MainService;
import org.springframework.beans.factory.annotation.Autowired;
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

    private MainService service;

    @Autowired
    public LoginController(MainService service) {
        this.service = service;
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET, name = "login")
    public ModelAndView login(Model model){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("login");

        if(!model.containsAttribute("user")){
            model.addAttribute("user", new UserDto());
        }

        return modelAndView;
    }

    //method run after submitting data in login.jsp
    @RequestMapping(value = "/checkLoginUser", method = RequestMethod.POST)
    public String checkUserInputData(@Validated @ModelAttribute("user")UserDto userDto,
                                           BindingResult result, RedirectAttributes attributes,
                                           HttpSession session, Model model){
        //check if user is on the session
        UserDto userInSession = (UserDto) session.getAttribute("user");
        if(Objects.nonNull(userInSession)){
            //if admin go to admin page
            if(userInSession.getAdmin()){
                return "redirect:/administration";
            }else {
                return "redirect:/shop";
            }
        }

        /*if(result.hasErrors()){
            attributes.addFlashAttribute("error", "Input data is wrong!");
            return "redirect:/login";
        }*/
        System.out.println(userDto.toString());
        UserDto loggedUserDto;
        try{
            loggedUserDto = service.getLoginService().verifyUser(userDto.getLogin(),userDto.getPassword());
        }catch (UserNotFindException ex){
            attributes.addFlashAttribute("error", ex.getMessage());
            return "redirect:/login";
        }
        catch (PasswordErrorException ex){
            attributes.addFlashAttribute("error", ex.getMessage());
            return "redirect:/login";
        }

        //if all right
        session.setAttribute("user", loggedUserDto);
        if(loggedUserDto.getAdmin()){
            session.setAttribute("admin",loggedUserDto);
            return "redirect:/administration";
        }else {
            session.setAttribute("user",loggedUserDto);
            model.addAttribute("user",userDto);
            return "redirect:/shop";
        }

    }

}

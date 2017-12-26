package com.shop.mvc.controllers;

import com.shop.mvc.domain.UserDto;
import com.shop.mvc.exceptions.PasswordErrorException;
import com.shop.mvc.exceptions.UserNotFindException;
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

    //method run after submitting data in login.jsp
    @RequestMapping(value = "/checkLoginUser", method = RequestMethod.POST)
    public String checkUserInputData(@Validated @ModelAttribute("userDto")UserDto userDto,
                                           BindingResult result, RedirectAttributes attributes,
                                           HttpSession session){
        //check if user is on the session
        UserDto userInSession = (UserDto) session.getAttribute("userDto");
        if(Objects.nonNull(userInSession)){
            //if admin go to admin page
            if(userInSession.getAdmin()){
                return "redirect:/administration";
            }else {
                return "redirect:/shop";
            }
        }

        if(result.hasErrors()){
            attributes.addFlashAttribute("error", "Input data is wrong!");
            return "redirect:/login";
        }

        UserDto loggedUserDto;
        try{
            loggedUserDto = service.getUserServiceImpl().verifyUser(userDto.getLogin(),userDto.getPassword());
        }catch (UserNotFindException ex){
            attributes.addFlashAttribute("error", ex.getMessage());
            return "redirect:/login";
        }
        catch (PasswordErrorException ex){
            attributes.addFlashAttribute("error", "Password is not right!");
            return "redirect:/login";
        }

        //if all right
        session.setAttribute("userDto", loggedUserDto);
        if(loggedUserDto.getAdmin()){
            return "redirect:/administration";
        }else {
            return "redirect:/shop";
        }

//        return "redirect:/shop";
    }

}

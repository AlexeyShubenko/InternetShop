package com.shop.mvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MainService {

    private LoginService loginService;

    @Autowired
    public MainService(LoginService loginService){
        this.loginService = loginService;
    }

    public LoginService getLoginService() {
        return loginService;
    }
}

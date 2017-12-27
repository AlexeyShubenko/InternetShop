package com.shop.mvc.service;

import com.shop.mvc.domain.UserDto;

public interface LoginService {

//    boolean checkExistingUser(String login);
    void saveUser(UserDto userDto);
    UserDto verifyUser(String login, String password);


}

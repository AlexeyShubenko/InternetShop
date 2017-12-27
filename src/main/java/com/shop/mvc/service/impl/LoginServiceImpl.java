package com.shop.mvc.service.impl;

import com.shop.mvc.domain.User;
import com.shop.mvc.domain.UserDto;
import com.shop.mvc.exceptions.PasswordErrorException;
import com.shop.mvc.exceptions.UserNotFindException;
import com.shop.mvc.repository.UserRepository;
import com.shop.mvc.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class LoginServiceImpl implements LoginService {

    public UserRepository userRepository;

    @Autowired
    public LoginServiceImpl(UserRepository userRepository){
        this.userRepository = userRepository;
    }


    @Override
    public void saveUser(UserDto userDto) {

    }

    @Override
    public UserDto verifyUser(String login, String password) {

        User user = userRepository.findUserByLogin(login);
        if(Objects.isNull(user)){
            throw new UserNotFindException("Користувача з таким логіном не існує");
        }

        if(!user.getPassword().equals(password)) {
            throw new PasswordErrorException("Пароль введено не правивльно");
        }

        return null;
    }
}

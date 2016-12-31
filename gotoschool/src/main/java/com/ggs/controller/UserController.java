package com.ggs.controller;

import com.ggs.dao.UserRepository;
import com.ggs.domain.TUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Administrator on 2016-12-31.
 */
@RestController
public class UserController {
    @Autowired
    UserRepository userRepository;
    @RequestMapping("/getAllUser")
    public List<TUser> getAllUser(){
        return userRepository.findAll();
    }
}

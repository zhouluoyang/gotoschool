package com.ggs.controller.user;

import com.ggs.dao.user.UserRepository;
import com.ggs.domain.TUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
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

    @RequestMapping("/saveUser")
    public void saveUser(TUser user){
        user.setCreatetime(new Date());
        userRepository.save(user);
    }
}

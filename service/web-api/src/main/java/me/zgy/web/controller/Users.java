package me.zgy.web.controller;


import me.zgy.user.model.User;
import me.zgy.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Author: haolin
 * Email:  haolin.h0@gmail.com
 */
@Controller
@RequestMapping("/api/users")
public class Users {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public User query(@PathVariable(value = "id") Long id){
        return userService.findById(id);
    }
}

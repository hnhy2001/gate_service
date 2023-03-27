package com.example.gateservice.controller;

import com.example.gateservice.model.User;
import com.example.gateservice.service.BaseService;
import com.example.gateservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("user")
public class UserController extends BaseController<User> {
    @Autowired
    UserService userService;
    @Override
    protected BaseService<User> getService() {
        return userService;
    }
}

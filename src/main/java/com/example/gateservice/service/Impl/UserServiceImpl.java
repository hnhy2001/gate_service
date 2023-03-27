package com.example.gateservice.service.Impl;


import com.example.gateservice.model.User;
import com.example.gateservice.repository.BaseRepository;
import com.example.gateservice.repository.UserRepository;
import com.example.gateservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends BaseServiceImpl<User> implements UserService {
    @Autowired
    UserRepository userRepository;
    @Override
    protected BaseRepository<User> getRepository() {
        return userRepository;
    }
}


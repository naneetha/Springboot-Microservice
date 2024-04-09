package com.example.microservice.service;

import org.springframework.stereotype.Service;

import com.example.microservice.model.User;

@Service
public class UserServiceImpl implements UserDao{

@Autowired
private UserDao userdao;

@Override
public boolean saveUser(User user){
  return userdao.saveUser(user);
} 
}


package com.example.microservice.controller;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController{

@Autowired
private UserService userService;

@PostMapping("/user")
public ResponseEntity<String> saveUser(RequestBody User user){
 boolean result = userService.saveUser(user);
 if(result)
    return ResponseEntity.ok("User Created Successfully")
else
    return ResponseEntity.status(HttpStatus.BAD_REQUEST).build(); 
}
}

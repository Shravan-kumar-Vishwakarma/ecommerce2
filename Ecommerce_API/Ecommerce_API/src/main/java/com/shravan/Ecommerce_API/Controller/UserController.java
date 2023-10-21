package com.shravan.Ecommerce_API.Controller;

import com.shravan.Ecommerce_API.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    UserService userService;
    
}

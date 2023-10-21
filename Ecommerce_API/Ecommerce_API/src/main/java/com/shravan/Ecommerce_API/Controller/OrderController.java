package com.shravan.Ecommerce_API.Controller;

import com.shravan.Ecommerce_API.Service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {
    @Autowired
    OrderService orderService;
}

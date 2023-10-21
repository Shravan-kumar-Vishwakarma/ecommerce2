package com.shravan.Ecommerce_API.Controller;

import com.shravan.Ecommerce_API.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    @Autowired
    ProductService productService;
}

package com.shravan.Ecommerce_API.Service;

import com.shravan.Ecommerce_API.Irepo.IProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    @Autowired
    IProductRepo iProductRepo;
}

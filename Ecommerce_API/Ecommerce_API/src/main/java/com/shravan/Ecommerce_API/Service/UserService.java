package com.shravan.Ecommerce_API.Service;

import com.shravan.Ecommerce_API.Irepo.IUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    IUserRepo iUserRepo;
}

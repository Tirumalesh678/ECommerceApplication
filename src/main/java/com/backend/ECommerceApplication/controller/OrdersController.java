package com.backend.ECommerceApplication.controller;

import com.backend.ECommerceApplication.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrdersController {
    @Autowired
    private OrdersService ordersService;
}

package com.backend.ECommerceApplication.controller;

import com.backend.ECommerceApplication.service.OrderItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderItemController {
    @Autowired
    private OrderItemService orderItemService;
}

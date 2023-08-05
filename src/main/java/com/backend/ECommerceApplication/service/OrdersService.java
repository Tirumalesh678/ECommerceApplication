package com.backend.ECommerceApplication.service;

import com.backend.ECommerceApplication.entity.Orders;
import com.backend.ECommerceApplication.repository.OrdersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrdersService {

    @Autowired
    private OrdersRepository ordersRepository;

    public List<Orders> getAllOrders()
    {
        return ordersRepository.findAll();
    }
}

package com.backend.ECommerceApplication.service;

import com.backend.ECommerceApplication.entity.OrderItem;
import com.backend.ECommerceApplication.repository.OrderItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class orderItemService {

    @Autowired
    private OrderItemRepository orderItemRepository;

    public List<OrderItem> getAllOrderItem()
    {
        return orderItemRepository.findAll();
    }
}

package com.backend.ECommerceApplication.service;

import com.backend.ECommerceApplication.entity.Product;
import com.backend.ECommerceApplication.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> getAllProduct()
    {
        return productRepository.findAll();
    }
}

package com.backend.ECommerceApplication.service;

import com.backend.ECommerceApplication.entity.Category;
import com.backend.ECommerceApplication.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> getAllCategory()
    {
        return categoryRepository.findAll();
    }

}

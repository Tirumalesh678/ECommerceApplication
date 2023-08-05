package com.backend.ECommerceApplication.service;

import com.backend.ECommerceApplication.entity.Address;
import com.backend.ECommerceApplication.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService {

    @Autowired
    private AddressRepository addressRepository;

    public List<Address> getAllAddress()
    {
        return addressRepository.findAll();
    }
}

package com.backend.ECommerceApplication.repository;

import com.backend.ECommerceApplication.entity.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrdersRepository extends JpaRepository<Orders,Long> {

}

package com.backend.ECommerceApplication.repository;

import com.backend.ECommerceApplication.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
    //custom query methods
}

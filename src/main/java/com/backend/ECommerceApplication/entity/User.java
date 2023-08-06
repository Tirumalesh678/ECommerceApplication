package com.backend.ECommerceApplication.entity;

import com.backend.ECommerceApplication.Constants.UserRole;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long userId;

    @Column(nullable = false)
    private String username;

    @Column(nullable = false,unique = true)
    private  String email;

    @Column(nullable = false)
    private String password;

    /*@Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private UserRole role;*/

    @Column(name="created_at",nullable = false,updatable = false)
    @CreationTimestamp
    private LocalDateTime createdAt;

    @Column(name="updated_at",nullable = false)
    @UpdateTimestamp
    private LocalDateTime updatedAt;
}

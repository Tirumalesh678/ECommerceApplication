package com.backend.ECommerceApplication.entity;

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
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "category_id")
    private Long categoryId;

    @Column(nullable = false)
    private String name;


    private String description;

    @Column(name="created_at",nullable = false,updatable = false)
    @CreationTimestamp
    private LocalDateTime createdAt;

    @Column(name="updated_at",nullable = false,updatable = true)
    @UpdateTimestamp
    private LocalDateTime updatedAt;

}

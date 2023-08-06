package com.backend.ECommerceApplication.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.cglib.core.Local;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class OrderItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_item_id")
    private Long orderItemId;

    @ManyToOne
    @JoinColumn(name = "userId")
    private User user;

    @ManyToOne
    @JoinColumn(name = "productId")
    private Product product;

    @Column(nullable = false)
    private Integer quantity;

    @Column(name="subtotal",nullable = false)
    private BigDecimal subTotal;

    @Column(name="created_at",nullable = false,updatable = false)
    @CreationTimestamp
    private LocalDateTime createdAt;

    @Column(name="updated_at",nullable = false)
    @UpdateTimestamp
    private LocalDateTime updatedAt;
}

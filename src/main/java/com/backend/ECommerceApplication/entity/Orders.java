package com.backend.ECommerceApplication.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "orders")
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id")
    private Long orderId;

    @ManyToOne
    @JoinColumn(name = "userId")
    private User user;

    @Column(name="order_date",nullable = false)
    private LocalDateTime orderDate;

    @Column(name="total_amount",nullable = true)
    private BigDecimal totalAmount;

    @Column(name="order_status",nullable = false)
    private String orderStatus;

    @Column(name="created_at",nullable = false,updatable = false)
    @CreationTimestamp
    private LocalDateTime createdAt;

    @Column(name="updated_at",nullable = false)
    @UpdateTimestamp
    private LocalDateTime updatedAt;

}

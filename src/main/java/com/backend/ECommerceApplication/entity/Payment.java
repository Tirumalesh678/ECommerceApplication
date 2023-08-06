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
@Table(name = "payment")
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "payment_id")
    private Long paymentId;

    @OneToOne
    @JoinColumn(name = "orderId")
    private Orders orders;

    @Column(name="payment_date",nullable = false)
    private LocalDateTime paymentDate;

    @Column(name="payment_status",nullable = false)
    private String paymentStatus;

    @Column(name="payment_amount",nullable = false)
    private BigDecimal paymentAmount;

    @Column(name="payment_method",nullable = false)
    private String paymentMethod;

    @Column(name="created_at",nullable = false,updatable = false)
    @CreationTimestamp
    private LocalDateTime createdAt;

    @Column(name="updated_at",nullable = false)
    @UpdateTimestamp
    private LocalDateTime updatedAt;
}

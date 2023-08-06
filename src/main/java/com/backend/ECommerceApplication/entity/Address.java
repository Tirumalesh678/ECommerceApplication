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
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "address_id")
    private Long addressId;

    @ManyToOne
    @JoinColumn(name = "userId")
    private User user;

    @Column(name="street_address",nullable = false)
    private String streetAddress;

    @Column(nullable = false)
    private String city;

    @Column(nullable = false)
    private String state;

    @Column(name="postal_code",nullable = false)
    private String postalCode;

    @Column(nullable = false)
    private String country;

    @CreationTimestamp
    @Column(name="created_at",nullable = false,updatable = false)
    private LocalDateTime createdAt;

    @UpdateTimestamp
    @Column(name="updated_at",nullable = false)
    private LocalDateTime updatedAt;
}

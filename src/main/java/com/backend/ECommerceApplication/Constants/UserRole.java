package com.backend.ECommerceApplication.Constants;

public enum UserRole {
    CUSTOMER("customer"),
    ADMIN("admin");

    private final String role;

    UserRole(String role) {
        this.role = role;
    }

    public String getRole() {
        return role;
    }
}

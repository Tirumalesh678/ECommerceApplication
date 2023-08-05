package com.backend.ECommerceApplication.Constants;

public enum UserRole {
    CUSTOMER("customer"),
    ADMIN("admin");

    private final String displayName;
    UserRole(String displayName) {
        this.displayName=displayName;
    }
    public String getDisplayName()
    {
        return displayName;
    }
}

package com.product.api.product.Api.Security.domains.user;

public record RegisterDTO(String username, String password, UserRoles role) {
}

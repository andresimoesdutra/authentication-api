package com.product.api.product.Api.Security.domains.product;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;

public record ProductRequestDTO(
        @NotNull
        String name,
        @NotNull
        BigDecimal price
) {
}

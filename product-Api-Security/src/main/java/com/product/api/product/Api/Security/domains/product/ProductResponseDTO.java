package com.product.api.product.Api.Security.domains.product;

import java.math.BigDecimal;
import java.util.UUID;

public record ProductResponseDTO(
        UUID id,
        String name,
        BigDecimal price
) {
    public ProductResponseDTO(Product product) {
        this(product.getId(), product.getName(), product.getPrice());
    }
}

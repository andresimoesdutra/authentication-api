package com.product.api.product.Api.Security.repositories;

import com.product.api.product.Api.Security.domains.product.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ProductRepository extends JpaRepository<Product, UUID> {
}

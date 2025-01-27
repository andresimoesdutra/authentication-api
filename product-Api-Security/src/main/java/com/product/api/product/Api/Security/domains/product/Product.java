package com.product.api.product.Api.Security.domains.product;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.UUID;

@Entity(name = "products_tb")
@Table(name = "products_tb")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private BigDecimal price;


    public Product() {}

    public Product(String name, BigDecimal price) {
        this.name = name;
        this.price = price;
    }


    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}

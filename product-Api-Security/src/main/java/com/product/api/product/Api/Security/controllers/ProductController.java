package com.product.api.product.Api.Security.controllers;

import com.product.api.product.Api.Security.domains.product.Product;
import com.product.api.product.Api.Security.domains.product.ProductRequestDTO;
import com.product.api.product.Api.Security.domains.product.ProductResponseDTO;
import com.product.api.product.Api.Security.repositories.ProductRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;


    @PostMapping
    public ResponseEntity postProduct(@RequestBody @Valid ProductRequestDTO product) {
        Product newProduct = new Product(product.name(), product.price());

        productRepository.save(newProduct);
        return ResponseEntity.ok().build();
    }

    @GetMapping
    public ResponseEntity getAllProducts() {
        List<ProductResponseDTO> productList = productRepository.findAll().stream().map(ProductResponseDTO::new).toList();

        return ResponseEntity.ok(productList);
    }

}

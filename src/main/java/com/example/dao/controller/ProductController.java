package com.example.dao.controller;

import com.example.dao.repository.ProductRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    private final ProductRepository productRepository;

    public ProductController(ProductRepository productRepository) {

        this.productRepository = productRepository;
    }

    @GetMapping("/products/fetch-product")
    public List<String> fetchProduct(@RequestParam String name) {
        return productRepository.getProductName(name);
    }
}

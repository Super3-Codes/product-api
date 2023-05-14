package com.example.productapi.service;

import com.example.productapi.domain.Product;
import com.example.productapi.product.api.request.ProductRequest;
import com.example.productapi.product.api.response.ProductResponse;
import com.example.productapi.repository.ProductRepository;
import com.example.productapi.support.ProductMapper;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    private final ProductRepository productRepository;
    private final ProductMapper productMapper;

    public ProductService(ProductRepository productRepository, ProductMapper productMapper) {
        this.productRepository = productRepository;
        this.productMapper = productMapper;
    }
    public ProductResponse create(ProductRequest productRequest){
        Product product = productRepository.save(productMapper.toProduct(productRequest));
        return productMapper.toProductResponse(product);
    }
}

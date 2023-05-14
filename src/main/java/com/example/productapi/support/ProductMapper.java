package com.example.productapi.support;

import com.example.productapi.domain.Product;
import com.example.productapi.product.api.request.ProductRequest;
import com.example.productapi.product.api.response.ProductResponse;

public class ProductMapper {
    public Product toProduct(ProductRequest productRequest){
        return  new Product(productRequest.getName());
    }

    public ProductResponse toProductResponse(Product product){
        return new ProductResponse(product.getId(),product.getName());
    }
}

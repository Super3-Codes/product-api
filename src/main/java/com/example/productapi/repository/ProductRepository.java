package com.example.productapi.repository;

import com.example.productapi.domain.Product;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
@Repository
public class ProductRepository {
    protected  final HashMap<Long, Product> map = new HashMap<>();
    protected long counter = 1;

    public Product save(Product entity){
        setId(entity);
        return entity;
    }

    private Product setId(Product entity) {
        entity.setId(counter);
        map.put(counter,entity);
        counter++;
        return entity;
    }
}

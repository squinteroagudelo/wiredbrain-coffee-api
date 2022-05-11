package com.wiredbraincoffee.api.repository;

import com.wiredbraincoffee.api.model.Product;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface ProductRepository
        extends ReactiveMongoRepository<Product, String> {
}

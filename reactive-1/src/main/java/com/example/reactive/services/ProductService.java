package com.example.reactive.services;

import com.example.reactive.model.Product;
import com.example.reactive.repositories.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

import java.time.Duration;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;

    public Flux<Product> getProducts() {
        return productRepository.findAll()
                .delayElements(Duration.ofSeconds(5));
    }

}

package com.example.reactive.services;

import com.example.reactive.model.Product;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

import java.time.Duration;

@Service
public class ProductService {

    public Flux<Product> products() {

        var water = new Product("Water");
        var chocolate = new Product("Chocolate");
        var iceCream = new Product("ice-cream");
        return Flux.just(water, chocolate, iceCream)
                .delayElements(Duration.ofSeconds(5));

    }
}

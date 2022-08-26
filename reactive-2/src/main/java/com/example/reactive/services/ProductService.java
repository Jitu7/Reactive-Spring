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
        var cake = new Product("Cake");
        var iceCream = new Product("ice-cream");
        var mobile = new Product("mobile");
        var pen = new Product("pen");
        var pencil = new Product("pencil");

        return Flux.just(water, chocolate, iceCream, cake, mobile, pen, pencil)
                .delayElements(Duration.ofSeconds(5));

    }
}

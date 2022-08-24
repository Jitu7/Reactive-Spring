package com.example.reactive.config;

import com.example.reactive.handler.ProductHandler;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RouterFunctions.route;

@Configuration
@RequiredArgsConstructor
public class RoutesConfig {
    private final ProductHandler productHandler;

    @Bean
    public RouterFunction<ServerResponse> routes() {
        return route()
                .GET("/products", productHandler::getAll)
                .build();
    }

}

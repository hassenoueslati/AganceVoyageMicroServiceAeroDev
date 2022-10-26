package com.javainuse.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringCloudConfig {

    @Bean
    public RouteLocator gatewayRoutes(RouteLocatorBuilder builder) {
        return builder.routes()
                .route(r -> r.path("/hotel/**")
                        .uri("lb://reservation-service")
                        .id("hl"))
                .route(r -> r.path("/airoport/**")
                        .uri("lb://gestionvole-service")
                        .id("h2"))
                .route(r -> r.path("/offre/**")
                        .uri("lb://offre-service")
                        .id("h3"))
                .route(r -> r.path("/voiture/**")
                        .uri("lb://Voituree-service")
                        .id("h4"))
                .build();
    }

}
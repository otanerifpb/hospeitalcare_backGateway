package br.edu.ifpb.pdist.hospitalgateway;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class GatewayConfig {

    @Bean
    public RouteLocator gatewayRoutes(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("user", r -> r.path("/user/**")
                        // .uri("http://localhost:8085"))//local
                        .uri("https://userback-6fb5d32424ff.herokuapp.com"))
                .route("medico", r -> r.path("/medico/**")
                        // .uri("http://localhost:8085"))
                        .uri("https://apibackmedico-017465360da7.herokuapp.com"))
                .build();
    }
}


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
                        .uri("https://hospitalbackuser-d316271b873b.herokuapp.com"))
                // .route("user", r -> r.path("/user/**")
                //         .uri("http://localhost:8085"))
                .build();
    }
}


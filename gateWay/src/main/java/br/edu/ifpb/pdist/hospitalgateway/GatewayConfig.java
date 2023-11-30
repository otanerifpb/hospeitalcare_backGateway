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
                        .uri("http://localhost:8085"))//local
                        //.uri("https://userback-6fb5d32424ff.herokuapp.com"))
                .route("medico", r -> r.path("/medico/**")
                        .uri("http://localhost:8087"))
                        //.uri("https://medicoback-16c59f9b3a2e.herokuapp.com"))
                .route("paciente", r -> r.path("/paciente/**")
                        .uri("http://localhost:8087"))
                .route("enfermeiro", r -> r.path("/enfermeiro/**")
                        .uri("http://localhost:8088"))
                .route("recepcionista", r -> r.path("/recepcionista/**")
                        .uri("http://localhost:8088"))
                .build();
    }

    
}


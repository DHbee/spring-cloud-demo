package com.dharbor.test.springclouddemo;

import org.springframework.cloud.gateway.filter.GatewayFilter;
import org.springframework.cloud.gateway.filter.factory.AbstractGatewayFilterFactory;
import org.springframework.stereotype.Component;


@Component
public class AuthenticationValidator extends AbstractGatewayFilterFactory<AuthenticationValidator.Config> {

    public AuthenticationValidator(){
        super(Config.class);
    }

    @Override
    public GatewayFilter apply(Config config) {
        return (exchange, chain) -> {
            System.out.println("it is gateway filter");
            return chain.filter(exchange);
        };

    }

    public static class Config {
    }
}

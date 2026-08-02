package com.cinebook.bookingservice.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI bookingServiceOpenApi() {
        return new OpenAPI()
                .info(new Info()
                        .title("Booking Service API")
                        .version("1.0")
                        .description("Handles movie ticket bookings for CineBook, calling Movie and Theater services"));
    }
}
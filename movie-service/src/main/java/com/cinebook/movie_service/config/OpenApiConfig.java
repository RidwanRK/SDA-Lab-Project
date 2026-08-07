package com.cinebook.movieservice.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI movieServiceOpenAPI() {
        return new OpenAPI().info(new Info()
                .title("CineBook - Movie Service API")
                .description("Movie catalog: movies, genres, cast and showtimes")
                .version("v1.0"));
    }
}

package com.assignment.econrich.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI OpenApi() {

        return new OpenAPI()
                .info(new Info().title("김시우 - Echo&Rich Test API Docs")
                        .description("Springdoc 라이브러리 Swagger 사용")
                        .version("v1"));
    }
}

package com.example.demo.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition(
        info = @Info(title = "게시판 API", version = "1.0", description = "Spring Boot 게시판 API 문서")
)
public class SwaggerConfig {
}

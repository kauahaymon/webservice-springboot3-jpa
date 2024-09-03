package com.company.service.config;


import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition(
        info = @Info(
                title = "E-commerce Service REST API",
                version = "1.0.0",
                description = "Documentação da API do Spring Boot",
                license = @License(name = "Apache License 2.0", url = "https://www.apache.org/licenses/LICENSE-2.0")
        )
        // ,servers = @Server(url = "http://localhost:8080", description = "Servidor Local")
)
@SecurityScheme(
        name = "bearerAuth",
        type = SecuritySchemeType.HTTP,
        scheme = "bearer",
        bearerFormat = "JWT"
)
public class OpenApiConfig {
}

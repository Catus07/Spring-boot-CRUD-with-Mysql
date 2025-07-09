package com.example.DataBaseMysql.Config;

import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import io.swagger.v3.oas.models.OpenAPI;
import org.springframework.stereotype.Component;

@Component
public class SwaggerConfig {
    @Bean
    OpenAPI openAPI(){
        return new OpenAPI().info(new Info().title("DataBaseMysql Rest APIs crude operation")
                .description("this is spring boot application show how to connect to mysql using spring data jpa")
                .summary("crude operation RestApi in a spring boot application with mysql ").summary("Created by Revocatus Joseph Nduki"));
    }


}

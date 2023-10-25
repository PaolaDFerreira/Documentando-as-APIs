package com.ifsul.restaurante.config;
import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApiDocumentationConfig {

    @Bean
    public OpenAPI apiDocConfig() {
        return new OpenAPI()
                .info(new Info()
                        .title("Documentando-as-APIs")
                        .description("API que cria e gerencia restaurantes")
                        .version("0.0.1")
                        .contact(new Contact()
                                .name("Paola")
                                .email("paola.ferreira329@gmail.com")))
                .externalDocs(new ExternalDocumentation()
                        .description("Github")
                        .url("https://github.com/PaolaDFerreira/Documentando-as-APIs"));
    }
}
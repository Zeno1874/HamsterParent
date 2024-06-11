package com.zeno.parent.common.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {
    @Bean
    public OpenAPI openAPI() {
        return new OpenAPI()
                .info(apiInfo());
    }

    private Info apiInfo() {
        /*作者信息*/
        Contact contact = new Contact().name("Zeno").email("zeno1874@163.com").url("https://github.com/Zeno1874");
        return new Info()
                .title( "仓鼠管理API")
                .description("仓鼠管理API文档")
                .version("v1.0")
                .contact(contact);
    }
}
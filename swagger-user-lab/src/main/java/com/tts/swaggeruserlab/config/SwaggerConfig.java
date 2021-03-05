package com.tts.swaggeruserlab.config;


import com.tts.swaggeruserlab.model.UserV1;
import com.tts.swaggeruserlab.model.UserV2;
import io.swagger.annotations.ApiOperation;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger.web.DocExpansion;
import springfox.documentation.swagger.web.UiConfiguration;
import springfox.documentation.swagger.web.UiConfigurationBuilder;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
//@ApiOperation(value = "Get all Users", response = UserV1.class)
public class SwaggerConfig {
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                //.groupName("Version2")
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.tts.swaggeruserlab"))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(buildApiInfo());
    }

    private ApiInfo buildApiInfo() {
        return new ApiInfoBuilder()
                .title("Swagger User API")
                .description("REST API for interacting with User")
                .version("1.0.0")
                .contact(new Contact("SUNU", "website.com", "developer@website.com"))
                .license("Apache License Version 2.0")
                .license("https://www.apache.org/licenses/LICENSE-2.0")
                .build();
    }

//    @Bean
//    public Docket apiV1() {
//        return new Docket(DocumentationType.SWAGGER_2)
//                .groupName("Version 1")
//                .select()
//                .apis(RequestHandlerSelectors.basePackage("com.tts.swaggeruserlab"))
//                .paths(PathSelectors.ant("/V1/**"))
//                .build()
//                .apiInfo(buildApiInfoV1());
//    }
//
//    private ApiInfo buildApiInfoV1() {
//        return new ApiInfoBuilder()
//                .title("Swagger User API")
//                .description("REST API for interacting with User")
//                .version("1.0.0")
//                .contact(new Contact("Developer name", "website.com", "developer@website.com"))
//                .license("Apache License Version 2.0")
//                .license("https://www.apache.org/licenses/LICENSE-2.0")
//                .build();
//    }
//
//    @Bean
//    public Docket apiV2() {
//        return new Docket(DocumentationType.SWAGGER_2)
//                .groupName("Version2")
//                .select()
//                .apis(RequestHandlerSelectors.basePackage("com.tts.swaggeruserlab"))
//                .paths(PathSelectors.ant("/V2/**"))
//                .build()
//                .apiInfo(buildApiInfoV2());
//    }
//
//    private ApiInfo buildApiInfoV2() {
//        return new ApiInfoBuilder()
//                .title("Swagger User API")
//                .description("REST API for interacting with User")
//                .version("2.0.0")
//                .contact(new Contact("Developer name", "website.com", "developer@website.com"))
//                .license("Apache License Version 2.0")
//                .license("https://www.apache.org/licenses/LICENSE-2.0")
//                .build();
//    }


    @Bean
    UiConfiguration buildUiConfig() {
        return UiConfigurationBuilder.builder()
                .docExpansion(DocExpansion.FULL)
                .build();
    }

}

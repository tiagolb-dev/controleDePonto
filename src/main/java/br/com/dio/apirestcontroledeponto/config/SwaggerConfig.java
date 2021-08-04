package br.com.dio.apirestcontroledeponto.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;


@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket projectApi(){
        return new Docket((DocumentationType.SWAGGER_2))
                .select()
                .apis(RequestHandlerSelectors.basePackage("br.com.dio.apirestcontroledeponto"))
                .paths(PathSelectors.regex("/jornada.*"))
                .build()
                .apiInfo(metaInfo());
    }

    private ApiInfo metaInfo(){
        ApiInfo apiInfo = new ApiInfo(
                "API Rest Controle de Ponto e acesso - Live Dio.",
                "Desenvolvendo uma API rest de controle de ponto e acesso para uma empresa.",
                "1.0",
                "Terms of Service",
                new Contact("Tiago Lopes", "",""),
                "Apache License Version 2.0",
                "https://www.apache.org/licenses/", new ArrayList<VendorExtension>()
        );

        return apiInfo;
    }
}

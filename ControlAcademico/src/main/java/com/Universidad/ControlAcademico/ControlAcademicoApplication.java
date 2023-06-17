package com.Universidad.ControlAcademico;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class ControlAcademicoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ControlAcademicoApplication.class, args);
	}
	@Bean
	public Docket api(){
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.Universidad.ControlAcademico"))
				.build()
				.apiInfo(apiDetails());
	}
	private ApiInfo apiDetails(){
		return new ApiInfoBuilder()
				.title("Api control academico")
				.contact(new Contact("Jefferson","no-url", "myemail"))
				.description("Base de datos estudiantes para control de notas")
				.build();
	}


}

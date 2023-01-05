package com.codemind;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.fasterxml.jackson.databind.ObjectMapper;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;


@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "Employees API", version =  "2.0", description =  "Employees Information"))
public class EmployeeManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeManagementApplication.class, args);
	}
	
	
	/*
	 * public OpenAPI customOpenAPI(@Value("${application-description}") String
	 * appDescription ,
	 * 
	 * @Value("${application-version}") String appVersion) {
	 * 
	 * return new OpenAPI().info(new
	 * Info().title("Codemind Employee Application").version(appVersion)
	 * .description(appDescription).termsOfService("http://swagger.io/terms/")
	 * .license(new License().name("Apache 2.0").url("http://springdoc.org"))); }
	 */
	
	/*
	 * @Operation public OpenAPI customOpenAPI() {
	 * 
	 * return new OpenAPI().info(new Info().title("Codemind Employee Application")
	 * .termsOfService("http://swagger.io/terms/") .license(new
	 * License().name("Apache 2.0").url("http://springdoc.org"))); }
	 */

}

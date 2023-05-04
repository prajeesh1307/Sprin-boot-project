package com.project.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;




@SpringBootApplication
@OpenAPIDefinition(
info =@Info(
		title = "Management",
	version = "1.1.2",
	description = "Museum Project",
	contact = @Contact(
			name = "Museum",
			email = "kratos@max.io"
			)
	)
)
public class ProjectReview1Application {

	public static void main(String[] args) {
		SpringApplication.run(ProjectReview1Application.class, args);
	}

}

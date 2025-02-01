package com.example.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.example.demo.admin.controller", "com.example.demo.admin.mapper.admin", "com.example.demo.admin.service"})
@MapperScan("com.example.demo.admin.mapper.admin")
public class CardCollectionApplication {

	public static void main(String[] args) {
		SpringApplication.run(CardCollectionApplication.class, args);
	}

}

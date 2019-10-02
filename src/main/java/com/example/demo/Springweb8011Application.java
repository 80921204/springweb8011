package com.example.demo;

import javax.annotation.Resource;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@SpringBootApplication
@MapperScan(value = "cn.com.dhc.ec.rpc.product.dao")
public class Springweb8011Application {

	public static void main(String[] args) {
		SpringApplication.run(Springweb8011Application.class, args);
	}
 
	
	
	@GetMapping("/zx")
	public String  execbb() {
		return "8011bb";
	}


}

package com.touwenzi_l;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages="com.touwenzi_l.dao")
public class SpringBoot01Application {
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBoot01Application.class, args);
	}
	
}

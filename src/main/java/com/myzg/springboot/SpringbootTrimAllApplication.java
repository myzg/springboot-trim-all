package com.myzg.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@MapperScan(value = "com.myzg.springboot.dao")
@EnableCaching
public class SpringbootTrimAllApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootTrimAllApplication.class, args);
	}

}

package com.springboot2.aop;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
/**
 * mybatis-plus mapper接口包扫描
 */
@MapperScan("com.springboot2.aop.dao")
/**
 * 开启基于注解的缓存
 */
@EnableCaching
public class AopApplication {

	public static void main(String[] args) {
		SpringApplication.run(AopApplication.class, args);
	}
}

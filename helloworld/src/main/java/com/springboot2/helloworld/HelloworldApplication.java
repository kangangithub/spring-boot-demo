package com.springboot2.helloworld;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * 项目启动报错Failed to configure a DataSource: 'url' attribute is not specified and no embedde
 * 添加(exclude = DataSourceAutoConfiguration.class)
 */
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
/**
 * Mapper接口所在的包
 */
@MapperScan("com.springboot2.helloworld.dao")
/**
 * @EnableAutoConfiguration 解决Property 'sqlSessionFactory' or 'sqlSessionTemplate' are required
 */
@EnableAutoConfiguration
public class HelloworldApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloworldApplication.class, args);
	}
}

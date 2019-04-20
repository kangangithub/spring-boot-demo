package com.springboot2.helloworld.demo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * 表示获取前缀为 ss 的配置信息, 新版本删除了local信息, 会警告可以采用属性注入的方式避免,
 * 也可以加入spring-boot-configuration-processor的依赖
 */
@ConfigurationProperties(prefix = "ss")
/**
 * 表明当前类是一个 Java Bean
 */
@Component
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    private String name;
    private Integer age;
}

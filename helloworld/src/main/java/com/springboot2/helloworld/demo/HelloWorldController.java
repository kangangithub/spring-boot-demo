package com.springboot2.helloworld.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: Akang
 * @Date: 2018/7/30 15:43
 * @Description:
 */
@RestController
@RequestMapping("/hello")
public class HelloWorldController {
    @Value("${name}")
    private String name;
    @Value("${age}")
    private Integer age;
    @Value("${content}")
    private String content;
    @Autowired
    private Student student;

    @ResponseBody
    @RequestMapping("/attributeTest")
    public String attributeTest() {
        return name + " " + age; //test 18
    }
    @ResponseBody
    @RequestMapping("/contentTest")
    public String contentTest() {
        return content; //name: test, age: 18
    }

    @ResponseBody
    @RequestMapping("/typeTest")
    public Student typeTest() {
        return student; //{"name":"test","age":18}
    }
}

# springbootdemo

#### 项目介绍
Spring Boot 2.0与其他框架集成的Demo, 集成MyBatis, Mybatis Generator, Mybatis-Plus, hikari连接池(2.0默认), PageHelper(分页), Redis(CRUD,缓存,发布订阅), Ehcache 3.x(缓存), AOP切面日志

####  组织架构
```$xslt
springbootdemo
|
|--aop  Spring Boot 2.0 整合 AOP面向切面编程
|   |--annotation  自定义注解
|   |--aspect  系统日志切面+控制层切面
|   |--controller  控制层
|   |--dao  Mapper接口层
|   |--service  业务层
|
|--base  基础模块
|   |--config  Mybatis-Plus配置
|   |--domain  项目用到的实体类
|
|--helloworld  Spring Boot 2.0 整合Mybatis+Mybatis Generator+PageHelper的Demo
|   |--controller  控制层
|   |--dao  Mapper接口层
|   |--demo  Spring Boot 2.0 的基础Demo
|   |--domain  该模块用到的实体类
|   |--service  业务层
|
|--springcache  Spring Cache 模块
    |--controller  控制层
    |--dao  Mapper接口层
    |--service  业务层
```

####  技术选项

技术|名称
---|---|
Spring Boot 2.0|springboot框架 
MyBatis|持久层框架
MyBatis Generator|代码生成
PageHelper|MyBatis物理分页插件
hikari|数据库连接池
Lombok|代码简化插件
Mybatis-Plus|Mybatis的加强版
Maven|项目构建管理

#### 模块说明

1. aop -- 日志切面
    * POST http://localhost:1003/aop/dept/get/29  
    * POST http://localhost:1003/aop/dept/modify/29  
        `
            {
              "id": 29,
              "parentId": 1,
              "name": "天津分公司",
              "sn": null,
              "delFlag": "0",
              "updateAt": "2018-08-21T10:32:21.000+0000",
              "createAt":"2018-05-21T10:32:21.000+0000",
              "updateBy": 1,
              "createBy": 1
            }
        `
    * POST http://localhost:1003/aop/dept/save  
        `
            {
              "parentId": 1,
              "name": "邯郸分公司",
              "sn": 1,
              "delFlag": "0",
              "updateAt": "2018-08-21T10:32:21.000+0000",
              "createAt":"2018-05-21T10:32:21.000+0000",
              "updateBy": 1,
              "createBy": 1
            }
        `  
    * POST http://localhost:1003/aop/dept/drop/40  
2. base -- 基础模块
3. helloworld -- Spring Boot 2.0 Demo
4. springcache -- Spring 缓存
    * POST http://localhost:1001/cache/spring/get/151  
    * POST http://localhost:1001/cache/spring/modify/151  
        `
            {
              "id": 151,
              "account": "liyuanfang",
              "name": "李元芳",
              "password": "bc6a785c17fe07912c65d79f40f9c6c0",
              "deptId": 35,
              "email": "15556548564@163.com",
              "mobile": "15556548564",
              "status": "1",
              "sex": "2",
              "birth": "1982-06-14",
              "picId": null,
              "createBy": 1,
              "createAt": "2018-08-23T09:33:59.000+0000",
              "updateAt": null,
              "updateBy": null
            }
        `  
package com.springboot2.aop.controller;

import com.springboot2.aop.annotation.Log;
import com.springboot2.aop.service.SysDeptService;
import com.springboot2.base.domain.SysDept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

/**
 * AOP测试
 * @Auther: Akang
 */
@RestController
@RequestMapping(value = "/aop/dept")
public class DeptController {

    /**
     * 一个接口多个实现, @Autowired, @Qualifier("beanID") 可以用@Resource代替
     * Spring创建bean时bean ID 默认类名首字母小写, 也可自定义
     */
    @Autowired
    @Qualifier("sysDeptServiceImpl")
//    @Resource
    private SysDeptService dept;

    /**
     * 查一个
     */
    @ResponseBody
    @PostMapping("/get/{id}")
    public SysDept getOne(@PathVariable(value = "id") int id) {
        return dept.getById(id);
    }

    /**
     * 删一个
     */
    @Log("删一个")
    @ResponseBody
    @PostMapping("/drop/{id}")
    public boolean drop(@PathVariable(value = "id") int id) {
        return dept.removeById(id);
    }

    /**
     * 改一个
     */
    @Log("改一个")
    @ResponseBody
    @PostMapping("/modify/{id}")
    public SysDept modifyById(@PathVariable(value = "id") int id, @RequestBody SysDept sysDept) {
        return dept.updateById(sysDept) ? sysDept : getOne(id);
    }

    /**
     * 加一个
     */
    @Log("加一个")
    @ResponseBody
    @PostMapping("/save")
    public boolean add(@RequestBody SysDept sysDept) {
        return dept.save(sysDept);
    }
}

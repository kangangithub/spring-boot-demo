package com.springboot2.springcache.controller;

import com.springboot2.base.domain.SysUser;
import com.springboot2.springcache.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

/**
 * @Auther: Akang
 * @Date: 2018/7/31 11:38
 * @Description:
 */
@RestController
@RequestMapping(value = "/cache/spring")
public class SpringCacheController {

    /**
     * 一个接口多个实现, @Autowired, @Qualifier("beanID") 可以用@Resource代替
     * Spring创建bean时bean ID 默认类名首字母小写, 也可自定义
     */
    @Autowired
    @Qualifier("springCache")
//    @Resource
    private SysUserService springCache;

    /**
     * 查一个
     */
    @ResponseBody
    @PostMapping("/get/{id}")
    public SysUser getOne(@PathVariable(value = "id") int id) {
        return springCache.queryById(id);
    }

    /**
     * 删一个
     */
    @ResponseBody
    @PostMapping("/drop/{id}")
    public boolean drop(@PathVariable(value = "id") int id) {
        return springCache.dropById(id);
    }

    /**
     * 改一个
     */
    @ResponseBody
    @PostMapping("/modify/{id}")
    public SysUser modifyById(@PathVariable(value = "id") int id, @RequestBody SysUser sysUser) {
        return springCache.modifyById(sysUser);
    }
}

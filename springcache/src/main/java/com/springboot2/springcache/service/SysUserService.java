package com.springboot2.springcache.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.springboot2.base.domain.SysUser;

/**
 * @Auther: Akang
 * @Date: 2018/11/23 11:18
 * @Description:
 */
public interface SysUserService extends IService<SysUser> {
    /**
     * 查一个
     */
    SysUser queryById(Integer id);

    /**
     * 改一个
     */
    SysUser modifyById(SysUser sysUser);

    /**
     * 删一个
     */
    boolean dropById(Integer id);
}

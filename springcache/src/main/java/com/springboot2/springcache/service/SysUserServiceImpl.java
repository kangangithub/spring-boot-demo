package com.springboot2.springcache.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.springboot2.base.domain.SysUser;
import com.springboot2.springcache.dao.SysUserMapper;
import org.springframework.stereotype.Service;

/**
 * @Auther: Akang
 * @Date: 2018/11/23 14:59
 * @Description:
 */
@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements SysUserService {

    @Override
    public SysUser queryById(Integer id) {
        return null;
    }

    @Override
    public SysUser modifyById(SysUser sysUser) {
        return null;
    }

    @Override
    public boolean dropById(Integer id) {
        return false;
    }
}

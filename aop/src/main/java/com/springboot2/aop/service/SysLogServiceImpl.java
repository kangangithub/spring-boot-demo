package com.springboot2.aop.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.springboot2.aop.dao.SysLogMapper;
import com.springboot2.base.domain.SysLog;
import org.springframework.stereotype.Service;

/**
 * @Auther: Akang
 * @Date: 2018/11/23 14:59
 * @Description:
 */
@Service
public class SysLogServiceImpl extends ServiceImpl<SysLogMapper, SysLog> implements SysLogService {
}

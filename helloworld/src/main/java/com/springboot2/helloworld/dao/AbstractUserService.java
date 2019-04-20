package com.springboot2.helloworld.dao;

/**
 * @Auther: Akang
 * @Date: 2019/2/22 09:17
 * @Description:
 */
public abstract class AbstractUserService {
    public abstract void query();
    public abstract void add();
    public void modify() {}
    public void drop() {

    }
}

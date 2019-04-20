package com.springboot2.helloworld.dao;

/**
 * @Auther: Akang
 * @Date: 2019/2/22 09:22
 * @Description:
 */
public class UserController {
    private UserService userService;

    public void test() {
        userService.query();
        userService.add();
        userService.modify();
        userService.drop();
    }
}

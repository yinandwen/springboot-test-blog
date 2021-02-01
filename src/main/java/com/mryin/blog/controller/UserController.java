package com.mryin.blog.controller;


import com.mryin.blog.common.lang.Result;
import com.mryin.blog.entity.User;
import com.mryin.blog.mapper.UserMapper;
import com.mryin.blog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author 测试人：MRYIN
 * @since 2021-01-30
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService userService ;

    @RequestMapping("/users/{id}")
    public Object getUsers(@PathVariable Integer id){
        return userService.getById(id);
    }
}

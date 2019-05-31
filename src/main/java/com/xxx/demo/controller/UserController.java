package com.xxx.demo.controller;/*
 *@Description:
 *@Author:姚嘉
 */

import com.xxx.demo.entity.Result;
import com.xxx.demo.entity.UserInfo;
import com.xxx.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService service;
    @RequestMapping("userAll/{thisPage}/{pageSize}")
    public Result selectAll(@RequestBody UserInfo userInfo, @PathVariable("thisPage") Integer thisPage, @PathVariable("pageSize") Integer pageSize){
        return service.selectAll(userInfo.getUsername(),thisPage,pageSize);
    }
}

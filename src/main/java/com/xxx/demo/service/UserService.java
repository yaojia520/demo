package com.xxx.demo.service;/*
 *@Description:
 *@Author:姚嘉
 */

import com.xxx.demo.entity.Result;
public interface UserService {
    /**
     * 查询所有用户信息
     * @param username 用户名
     * @param thisPage 当前页
     * @param pageSize 分页大小
     * @return
     */
    public Result selectAll(String username, Integer thisPage, Integer pageSize);
}

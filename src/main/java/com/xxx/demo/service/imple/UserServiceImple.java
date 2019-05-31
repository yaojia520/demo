package com.xxx.demo.service.imple;/*
 *@Description:
 *@Author:姚嘉
 */

import com.xxx.demo.entity.Result;
import com.xxx.demo.entity.UserInfo;
import com.xxx.demo.mapper.UserInfoMapper;
import com.xxx.demo.service.UserService;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class UserServiceImple implements UserService {
    @Autowired
    private UserInfoMapper userInfoMapper;
    @Override
    public Result selectAll(String username, Integer thisPage, Integer pageSize) {
        List<UserInfo> userInfos = userInfoMapper.selectAll(username, new RowBounds((thisPage - 1) * pageSize, pageSize));
        return new Result(200,"查询成功",userInfos,userInfoMapper.selectAllCount(username));
    }
}

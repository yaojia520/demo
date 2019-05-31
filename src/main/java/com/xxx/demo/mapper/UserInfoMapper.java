package com.xxx.demo.mapper;/*
 *@Description:
 *@Author:姚嘉
 */

import com.xxx.demo.entity.UserInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;
import java.util.List;
@Mapper
public interface UserInfoMapper {
    /**
     * 查询所有用户信息
     * @param username 用户名
     * @param rowBounds 分页
     * @return
     */
    public List<UserInfo> selectAll(@Param("username") String username, RowBounds rowBounds);

    /**
     * 统计所有用户信息条数
     * @param username 用户名
     * @return
     */
    public Integer selectAllCount(@Param("username") String username);
}

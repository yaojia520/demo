package com.xxx.demo.entity;/*
 *@Description: 返回给前台结果类型
 *@Author:姚嘉
 */

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Result {
    private  Integer code;
    private  String msg;
    private  Object data;
    private  Integer count;

    public Result() {
    }

    public Result(Integer code, String msg, Object data, Integer count) {
        this.code = code;
        this.msg = msg;
        this.data = data;
        this.count = count;
    }

    public Result(Integer code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }
}

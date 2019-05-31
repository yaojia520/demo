package com.xxx.demo.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;
@Setter
@Getter
@ToString
public class UserInfo implements Serializable {
    private Integer id;
    private String username;
    private String password;
    private String sex;
    private Date age;
    private String state;
}
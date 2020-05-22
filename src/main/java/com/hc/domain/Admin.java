package com.hc.domain;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * @Author: 梁云亮
 * @Date 2020/5/20 13:00
 * @Description:
 */
/**
    * 用户表
    */
@Getter
@Setter
@ToString//(exclude = {"time1","time2"})
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Admin implements Serializable {

    private static final long serialVersionUID = 5687824146462658480L;

    /**
    * 编号
    */
    private Integer id;

    /**
    * 账号
    */
    private String account;

    /**
    * 密码
    */
    private String password;

    /**
    * 昵称
    */
    private String nickname;

    /**
    * 性别
    */
    private Boolean gender;

    /**
    * 头像
    */
    private String img;

    /**
    * QQ
    */
    private String qq;

    /**
    * 联系电话
    */
    private String tel;

    /**
    * 邮箱
    */
    private String email;

    /**
    * 排序
    */
    private Integer level;

    /**
    * 简介
    */
    private String info;

    /**
    * 状态
    */
    private Integer status;

    /**
    * 创建时间
    */
    private LocalDateTime createTime;

    /**
    * 更新时间
    */
    private LocalDateTime updateTime;

    //根据范围查询用
    private LocalDate time1;
    private LocalDate time2;
}
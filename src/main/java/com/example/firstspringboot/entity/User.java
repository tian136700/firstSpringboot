package com.example.firstspringboot.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * <p>
 * 实体类
 * </p>
 */
@Data
@TableName(value = "sys_user")
public class User {

    @TableId(value = "id", type = IdType.AUTO)//主键
    private Integer id;

    private String username;

    private String password;

    private String nickname;

    private String avatarUrl;

}

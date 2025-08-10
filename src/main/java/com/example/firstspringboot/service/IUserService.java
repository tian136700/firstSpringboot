package com.example.firstspringboot.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.firstspringboot.entity.User;

import java.util.List;

public interface IUserService extends IService<User> {


    List<User> getUserList();
}

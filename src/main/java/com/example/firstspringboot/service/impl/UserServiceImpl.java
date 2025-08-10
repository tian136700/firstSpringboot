package com.example.firstspringboot.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.firstspringboot.entity.User;
import com.example.firstspringboot.mapper.UserMapper;
import com.example.firstspringboot.service.IUserService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

//服务实现类
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {
    @Resource
    private UserMapper userMapper;

    @Override
    public List<User> getUserList() {
        return userMapper.getUserList() ;
    }
}

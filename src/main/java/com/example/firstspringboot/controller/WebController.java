package com.example.firstspringboot.controller;

import com.example.firstspringboot.entity.User;
import com.example.firstspringboot.mapper.UserMapper;
import com.example.firstspringboot.service.IUserService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/web")
public class WebController {

    @Resource
    private IUserService userService;



    @GetMapping("/hello")
    private List<User> hello() {
//        return "hell22222o";
        return userService.getUserList();
    }
    //新需求


}

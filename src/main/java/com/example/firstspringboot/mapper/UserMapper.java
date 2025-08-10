package com.example.firstspringboot.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.firstspringboot.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
//import org.mybatis.spring.annotation.MapperScan;

import java.util.List;

/**
 * <p>
 * Mapper 接口
 * <p/>
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

     @Select("select * from sys_user")
     List<User> getUserList();
}

package com.test.user.service;

import com.test.user.mapper.UserMapper;
import com.test.user.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public User queryUserById(Integer id) {
//        try {
//            Thread.sleep(2000);
//        }catch (Exception e){
//            e.printStackTrace();
//        }
        return userMapper.selectByPrimaryKey(id);
    }
}

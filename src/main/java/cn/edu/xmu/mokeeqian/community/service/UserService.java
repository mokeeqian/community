package cn.edu.xmu.mokeeqian.community.service;

import cn.edu.xmu.mokeeqian.community.dao.UserMapper;
import cn.edu.xmu.mokeeqian.community.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public User findUserById(int id) {
        return userMapper.selectById(id);
    }

}

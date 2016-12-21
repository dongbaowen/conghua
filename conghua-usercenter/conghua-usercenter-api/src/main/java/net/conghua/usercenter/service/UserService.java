package net.conghua.usercenter.service;

import net.conghua.usercenter.beans.model.User;
import net.conghua.usercenter.dao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Baowen on 2016/12/21.
 */
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public List<User> getAllUsers() {
        List<User> list = userMapper.getAllUsers();
        return list;
    }

    public void addUser(String username, String password) {
        User user = new User(username, password);
        userMapper.insertUser(user);
        System.out.println(user);
    }

}

package net.conghua.usercenter.dao;

import net.conghua.usercenter.beans.model.User;

import java.util.List;

/**
 * Created by Baowen on 2016/12/21.
 */
public interface UserMapper {

    public List<User> getAllUsers();

    public void insertUser(User user);
}

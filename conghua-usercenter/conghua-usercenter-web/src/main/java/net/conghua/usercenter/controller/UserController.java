package net.conghua.usercenter.controller;

import net.conghua.usercenter.beans.model.User;
import net.conghua.usercenter.beans.vo.ConghuaResult;
import net.conghua.usercenter.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by Baowen on 2016/12/21.
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @ResponseBody
    @RequestMapping("/userlist")
    public ConghuaResult getAllUsers(){

        List<User> list = userService.getAllUsers();

        ConghuaResult result = ConghuaResult.ok(list);

        return result;
    }

    @ResponseBody
    @RequestMapping("/userlist2")
    public List<User> getAllUsers2(){

        List<User> list = userService.getAllUsers();

        return list;
    }

    @RequestMapping("/index")
    public String toIndex(){
        return "index";
    }

    @ResponseBody
    @RequestMapping("/add")
    public ConghuaResult addUser() throws Exception{

        String username = "李超";
        String password = "123123";

        userService.addUser(username, password);

        ConghuaResult result = ConghuaResult.ok("ok");

        return result;
    }
}


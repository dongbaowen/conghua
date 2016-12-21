package net.conghua.usercenter.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Baowen on 2016/12/21.
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/test")
    public String admin(){
        return "index";
    }
}

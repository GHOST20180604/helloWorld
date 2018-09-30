package com.allash.bootdemo.controller;


import com.allash.bootdemo.model.mapper.WUserMapper;
import com.allash.bootdemo.model.pojo.WUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping(value = "/user")
public class UserController {
    @Autowired
    WUserMapper userMapper;

    @RequestMapping(value = "/login")
    public String login(ModelAndView modelAndView) {
        WUser wUser = userMapper.selectByPrimaryKey(1);
        System.out.println(wUser.getId() + "_" + wUser.getPassword());
        System.out.println("login_");
        System.out.println("asdf");
        return "/page/index";
    }


}

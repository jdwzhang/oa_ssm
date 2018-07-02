package com.zw.oa.controller;

import com.zw.oa.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @program: oa_ssm
 * @description: 用户控制器
 * @author: zhang wei
 * @create: 2018-06-26 11:21
 **/
@Controller
public class UserController {
    @Autowired
    private UserService userService;

    /* HandlerMapping 配置 */
    @RequestMapping(path="/login", method = RequestMethod.POST)
    public String checkLogin(@RequestParam("name") String id, String pass) {


        System.out.println(id + ":" + pass);
        return "result";
    }
}

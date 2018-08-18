package com.java.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//控制层 @controller控制层组件，被扫描后会注册成bean
@Controller
@RequestMapping("/sucess")
public class UserController {
    //请求映射
    @RequestMapping("/add")
    public String add(){
        //视图信息，根据视图解析规则拼接具体页面信息
        return "/add";//     /WEB-INF/views/add.jsp
    }

    @RequestMapping("/update")
    public String update(){
        return "/update";
    }

    @RequestMapping("/delete")
    public String delete(){
        return "/delete";
    }

    @RequestMapping("/findById")
    public String findById(){
        return "/findById";
    }

    @RequestMapping("/findByProp")
    public String findByProp(){
        return "/findByProp";
    }
}

package com.cn.bilibili.controller.index;

import com.cn.bilibili.controller.base.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/index")
public class indexController extends BaseController{

    @RequestMapping("index")
    public String goIndex(){
        return "index";
    }
}

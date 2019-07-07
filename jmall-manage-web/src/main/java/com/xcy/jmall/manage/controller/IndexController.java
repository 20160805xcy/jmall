package com.xcy.jmall.manage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author xcy
 * @Desc
 * @date 2019/7/6 16:08
 * @Version v1.0
 */
@Controller
public class IndexController {

    //跳转到属性列表页
    @RequestMapping("attrListPage")
    public String attrListPage(){
        return "attrListPage";
    }

    //thymeleaf默认跳转到首页
    @RequestMapping("index")
    public String index(){
        return "index";
    }
}

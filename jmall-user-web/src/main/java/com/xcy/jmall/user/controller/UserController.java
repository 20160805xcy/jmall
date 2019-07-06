package com.xcy.jmall.user.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.xcy.jmall.bean.UserInfo;
import com.xcy.jmall.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author xcy
 * @Desc
 * @date 2019/3/11 23:17
 * @Version v1.0
 */
@RestController
@RequestMapping("userInfo")
public class UserController {

    //@Autowired
    @Reference //远程注入,RPC的一个远程调用代理
    private UserInfoService userInfoService;

    @RequestMapping("getUserInfoList")
    private List<UserInfo> getUserInfoList(){
        List<UserInfo> userInfoList = userInfoService.getUserInfoList();
        return userInfoList;
    }
}

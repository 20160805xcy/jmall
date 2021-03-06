package com.xcy.jmall.user.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.xcy.jmall.bean.UserInfo;
import com.xcy.jmall.service.UserInfoService;
import com.xcy.jmall.user.mapper.UserInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author xcy
 * @Desc
 * @date 2019/3/11 23:32
 * @Version v1.0
 */
//@Service("userInfoService")
@Service
public class UserServiceImpl implements UserInfoService {

    @Autowired
    private UserInfoMapper userInfoMapper;

    @Override
    public List<UserInfo> getUserInfoList() {
        return userInfoMapper.selectAll();
    }
}

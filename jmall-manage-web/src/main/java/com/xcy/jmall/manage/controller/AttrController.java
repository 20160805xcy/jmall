package com.xcy.jmall.manage.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.xcy.jmall.bean.BaseAttrInfo;
import com.xcy.jmall.service.AttrService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author xcy
 * @Desc
 * @date 2019/7/6 22:54
 * @Version v1.0
 */
@Controller
public class AttrController {

    @Reference
    AttrService attrService;


    @RequestMapping("saveAttr")
    @ResponseBody
    public String saveAttr(BaseAttrInfo baseAttrInfo){
        attrService.saveAttr(baseAttrInfo);

        return "success";

    }

    @RequestMapping("getAttrList")
    @ResponseBody
    public List<BaseAttrInfo> getAttrList(String catalog3Id){

        List<BaseAttrInfo> baseAttrInfos = attrService.getAttrList(catalog3Id);

        return baseAttrInfos;

    }
}
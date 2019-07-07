package com.xcy.jmall.service;

import com.xcy.jmall.bean.BaseAttrInfo;

import java.util.List;

/**
 * @author xcy
 * @Desc
 * @date 2019/7/6 23:25
 * @Version v1.0
 */
public interface AttrService {
    List<BaseAttrInfo> getAttrList(String catalog3Id);

    void saveAttr(BaseAttrInfo baseAttrInfo);
}

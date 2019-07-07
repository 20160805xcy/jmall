package com.xcy.jmall.service;

import com.xcy.jmall.bean.BaseCatalog1;
import com.xcy.jmall.bean.BaseCatalog2;
import com.xcy.jmall.bean.BaseCatalog3;

import java.util.List;

/**
 * @author xcy
 * @Desc
 * @date 2019/7/6 17:52
 * @Version v1.0
 */
public interface CatalogService {
    List<BaseCatalog1> getCatalog1();

    List<BaseCatalog2> getCatalog2(String catalog1Id);

    List<BaseCatalog3> getCatalog3(String catalog2Id);
}

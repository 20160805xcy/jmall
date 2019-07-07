package com.xcy.jmall.manage.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.xcy.jmall.bean.BaseCatalog1;
import com.xcy.jmall.bean.BaseCatalog2;
import com.xcy.jmall.bean.BaseCatalog3;
import com.xcy.jmall.manage.mapper.BaseCatalog1Mapper;
import com.xcy.jmall.manage.mapper.BaseCatalog2Mapper;
import com.xcy.jmall.manage.mapper.BaseCatalog3Mapper;
import com.xcy.jmall.service.CatalogService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author xcy
 * @Desc
 * @date 2019/7/6 18:00
 * @Version v1.0
 */
@Service
public class CatalogServiceImpl implements CatalogService {

    @Autowired
    BaseCatalog1Mapper baseCatalog1Mapper;
    @Autowired
    BaseCatalog2Mapper baseCatalog2Mapper;
    @Autowired
    BaseCatalog3Mapper baseCatalog3Mapper;
    @Override
    public List<BaseCatalog1> getCatalog1() {

        List<BaseCatalog1> baseCatalog1s = baseCatalog1Mapper.selectAll();
        return baseCatalog1s;
    }

    @Override
    public List<BaseCatalog2> getCatalog2(String catalog1Id) {

        BaseCatalog2 baseCatalog2 = new BaseCatalog2();
        baseCatalog2.setCatalog1Id(catalog1Id);
        List<BaseCatalog2> select = baseCatalog2Mapper.select(baseCatalog2);
        return select;
    }

    @Override
    public List<BaseCatalog3> getCatalog3(String catalog2Id) {
        BaseCatalog3 baseCatalog3 = new BaseCatalog3();
        baseCatalog3.setCatalog2Id(catalog2Id);
        List<BaseCatalog3> select = baseCatalog3Mapper.select(baseCatalog3);
        return select;
    }
}


package com.len.service.impl;

import com.len.base.BaseMapper;
import com.len.base.impl.BaseServiceImpl;
import com.len.entity.Good;
import com.len.mapper.GoodMapper;
import com.len.service.GoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by xu on 2019/4/25.
 */
@Service
public class GoodServiceImpl extends BaseServiceImpl<Good,String> implements GoodService{

    @Autowired
    GoodMapper goodMapper;

    @Override
    public BaseMapper<Good, String> getMappser() {
        return goodMapper;
    }
}

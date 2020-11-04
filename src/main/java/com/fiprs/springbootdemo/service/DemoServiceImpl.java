package com.fiprs.springbootdemo.service;

import com.alibaba.fastjson.JSONObject;
import com.fiprs.springbootdemo.dao.THjcczzTablelistMapper;
import com.fiprs.springbootdemo.entity.THjcczzTablelist;
import com.fiprs.springbootdemo.entity.THjcczzTablelistExample;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Log4j2
@Service
public class DemoServiceImpl implements DemoService {
    @Autowired
    private THjcczzTablelistMapper tHjcczzTablelistMapper;
    @Override
    public JSONObject findList() {
        JSONObject data = new JSONObject();
        THjcczzTablelistExample example = new THjcczzTablelistExample();
        example.createCriteria().andIdBetween(1,2);
        List<THjcczzTablelist> list =  tHjcczzTablelistMapper.selectByExample(example);
        log.info("===================================");
        log.info(list);
        data.put("oridata", list);
        return data;
    }
}

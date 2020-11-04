package com.fiprs.springbootdemo.controller;

import com.alibaba.fastjson.JSONObject;
import com.fiprs.springbootdemo.service.DemoService;
import lombok.extern.java.Log;
import lombok.extern.log4j.Log4j2;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import javax.annotation.Resource;

@RestController
@EnableSwagger2
@RequestMapping("my")
@Log4j2
public class DemoController {

    @Resource
    private DemoService demoService;

    @RequestMapping("/helloworld")
    public String getHelloWorld(){
        log.info("This is my first log:{}", "hello world!");
        return "hello my first springboot application.";
    }

    @RequestMapping("/resources")
    public String getResources(){
        JSONObject result = demoService.findList();
        log.info("====================service result===================");
        log.info(result);
        return "hello my first springboot application.";
    }
}

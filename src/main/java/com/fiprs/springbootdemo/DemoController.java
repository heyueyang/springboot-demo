package com.fiprs.springbootdemo;

import lombok.extern.java.Log;
import lombok.extern.log4j.Log4j2;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@RestController
@EnableSwagger2
@RequestMapping("my")
@Log4j2
public class DemoController {


    @RequestMapping("/helloworld")
    public String getHelloWorld(){
        log.info("This is my first log:{}", "hello world!");
        return "hello my first springboot application.";
    }
}

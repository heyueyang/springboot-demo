package com.fiprs.springbootdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})

@Configuration
public class SpringbootDemoApplication  extends SpringBootServletInitializer {

    public static void main(String[] args) {

        SpringApplication.run(SpringbootDemoApplication.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(SpringbootDemoApplication.class);
    }


}

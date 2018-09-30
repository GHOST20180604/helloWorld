package com.allash.bootdemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * @author yj
 */
@SpringBootApplication
@MapperScan("com.allash.bootdemo.model.mapper")
//@EnableSwagger2
public class BootdemoApplication extends SpringBootServletInitializer {
    public static void main(String[] args) {
        SpringApplication.run(BootdemoApplication.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(BootdemoApplication.class);
    }
}
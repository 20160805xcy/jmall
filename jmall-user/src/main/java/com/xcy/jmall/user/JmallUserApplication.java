package com.xcy.jmall.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = "com.xcy.jmall.user.mapper")
public class JmallUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(JmallUserApplication.class, args);
    }

}

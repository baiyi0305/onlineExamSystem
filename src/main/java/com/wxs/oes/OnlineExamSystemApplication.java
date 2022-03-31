package com.wxs.oes;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.wxs.oes.mapper")
public class OnlineExamSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(OnlineExamSystemApplication.class, args);
    }

}

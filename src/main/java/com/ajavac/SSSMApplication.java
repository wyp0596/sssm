package com.ajavac;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Spring Boot 启动类
 * Created by wyp0596 on 17/08/2017.
 */
@MapperScan("com.ajavac.dao")
@SpringBootApplication
public class SSSMApplication {

    public static void main(String[] args) {
        SpringApplication.run(SSSMApplication.class, args);
    }

}

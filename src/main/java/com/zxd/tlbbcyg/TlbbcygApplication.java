package com.zxd.tlbbcyg;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@MapperScan("com.zxd.tlbbcyg.mapper")
@SpringBootApplication
public class TlbbcygApplication {

    public static void main(String[] args) {
        SpringApplication.run(TlbbcygApplication.class, args);
    }

}

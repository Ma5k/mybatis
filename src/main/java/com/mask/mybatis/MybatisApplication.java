package com.mask.mybatis;

import com.mask.mybatis.mapper.OrderMapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Mask
 */
@SpringBootApplication
@MapperScan("com.mask.mybatis.mapper")
public class MybatisApplication {

    @Autowired
    static OrderMapper orderMapper;

    public static void main(String[] args) {
        SpringApplication.run(MybatisApplication.class, args);
    }
}

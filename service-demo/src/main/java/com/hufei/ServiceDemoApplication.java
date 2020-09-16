package com.hufei;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @Author:hufei
 * @CreateTime:2020-09-14
 * @Description:springboot启动类
 */
@SpringBootApplication                  //springboot启动类注解
@MapperScan("com.hufei.mapper")         //整合mybatis通用Mapper，扫描该包路径下的mapper接口
public class ServiceDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceDemoApplication.class, args);
    }

}

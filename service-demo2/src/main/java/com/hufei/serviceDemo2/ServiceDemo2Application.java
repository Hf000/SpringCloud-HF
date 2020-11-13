package com.hufei.serviceDemo2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @Author:hufei
 * @CreateTime:2020-11-13
 * @Description:service服务2启动类
 */
@SpringBootApplication          //springBoot启动类注解
@EnableDiscoveryClient          //开启Eureka客户端服务注解
@MapperScan("com.hufei.serviceDemo2.mapper")         //整合mybatis通用Mapper，扫描该包路径下的mapper接口
public class ServiceDemo2Application {
    public static void main(String[] args) {
        SpringApplication.run(ServiceDemo2Application.class,args);
    }
}

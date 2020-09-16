package com.hufei;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @Author:hufei
 * @CreateTime:2020-09-16
 * @Description:springboot启动类
 */
@SpringBootApplication          //springboot启动类注解
@EnableDiscoveryClient          //开启eureka客户端发现功能
public class ConsumerDemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerDemoApplication.class, args);
    }

    @Bean           //将当前方法返回的返回的bean对象交给spring管理，向spring容器中注入一个RestTemplate实例化bean
    public RestTemplate restTemplate() {            //spring对httpClient、okHttp、JDK原生URLConnection进行了封装，RestTemplate的工具类对上述的3种http客户端工具类进行了封装
        return new RestTemplate();
    }
}

package com.hufei.controller;

import com.hufei.entity.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Author:hufei
 * @CreateTime:2020-09-16
 * @Description:用户处理器
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private RestTemplate restTemplate;          //spring对httpClient、okHttp、JDK原生URLConnection进行了封装，RestTemplate的工具类对上述的3种http客户端工具类进行了封装

    @Autowired
    private DiscoveryClient discoveryClient;            //注入eureka服务地址获取工具类实例

    @RequestMapping("/{id}")
    public User queryUserById(@PathVariable Long id){
        /*String url = "http://localhost:8083/user/"+id;
        return restTemplate.getForObject(url, User.class);*/
//        List<ServiceInstance> serviceInstanceList = discoveryClient.getInstances("service-demo");           //获取eureka服务中的服务地址
//        ServiceInstance serviceInstance = serviceInstanceList.get(0);           //获取服务列表中的某一个服务，一般集群环境，这里需要用负载均衡的方式获取服务地址
//        String url = "http://" + serviceInstance.getHost() + ":" + serviceInstance.getPort() + "/user/" + id;
        String url = "http://service-demo/user/"+id;        //开启负载均衡后会根据服务提供应用名称：service-demo自动获取服务地址，默认轮询
        return restTemplate.getForObject(url, User.class);          //restTemplate可以对json格式字符串进行反序列化
    }
}

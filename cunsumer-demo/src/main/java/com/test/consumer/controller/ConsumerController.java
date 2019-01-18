package com.test.consumer.controller;


import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.test.consumer.client.UserClient;
import com.test.consumer.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("consumer")
//@DefaultProperties(defaultFallback = "defaultFallback") 熔断器回滚方法
public class ConsumerController {

//    @Autowired
//    private RestTemplate restTemplate;

//    @GetMapping("/{id}")
//    //@HystrixCommand(fallbackMethod = "queryUserByIdFallBack")
//    @HystrixCommand
//    public String queryUserById(@PathVariable("id") Integer id){
//        String url = "http://localhost:8801/user/" + id;
//        String user = restTemplate.getForObject(url, String.class);
//        return user;
//    }
//
//    public String defaultFallback(){
//        return "默认提示：对不起，网络太拥挤";
//    }
    @Autowired
    private UserClient userClient;

    @GetMapping("/{id}")
    public User queryUserById(@PathVariable("id") Integer id){
        User user = userClient.queryUserById(id);
        return user;
    }

}

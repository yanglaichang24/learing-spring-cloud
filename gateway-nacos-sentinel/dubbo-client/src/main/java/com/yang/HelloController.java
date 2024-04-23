package com.yang;

import com.yang.api.HelloService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @DubboReference
    private HelloService helloService;

    @Resource
    RestTemplate restTemplate;

    @RequestMapping("/{name}")
    public String get(@PathVariable String name){
        return helloService.say(name);
    }

    @RequestMapping("/rest/{name}")
    public String rest(@PathVariable String name){
        return restTemplate.getForObject("http://providers:com.yang.api.HelloService/hello", String.class);
    }


}

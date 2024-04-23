package com.yang;

import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/***
 * @Author 徐庶   QQ:1092002729
 * @Slogan 致敬大师，致敬未来的你
 */
@RestController
@DefaultProperties(defaultFallback = "fallbackM")
public class RestTemplateController {

    @Resource
    RestTemplate restTemplate;

    @RequestMapping("/hello")
    public String hello(){
        return restTemplate.getForObject("http://hello-server/hello", String.class);
    }

    @RequestMapping("/hystrix")
    //@HystrixCommand(fallbackMethod = "fallbackM")
    @HystrixCommand()
    public String hystrix(){
        return restTemplate.getForObject("http://hello-server/hello", String.class);
    }

    public String fallbackM(){
        return "hystrix enable";
    }

}

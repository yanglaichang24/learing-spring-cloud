package com.yang;

import com.yang.api.HelloService;
import org.apache.dubbo.config.annotation.DubboService;

@DubboService
public class HelloServiceImpl implements HelloService {

    @Override
    public String say(String who) {
        return who + ": say Hello";
    }

    @Override
    public String hello() {
        return " Hello ";
    }
}

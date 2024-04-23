package com.yang;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;

@RestController()
public class HelloController {

    @GetMapping("/hello")
    @ResponseBody
    public String test() throws UnknownHostException {
        String hostAddress = InetAddress.getLocalHost().getHostAddress();
        return "hello : " + hostAddress;
    }




}

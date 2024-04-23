package com.yang;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("hello-server")
public interface FeignService {

    @GetMapping("/hello")
    public String hello();

}

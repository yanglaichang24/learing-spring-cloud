package com.yang;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class OpenFeignController {

    @Resource
    private FeignService feignService;

    @GetMapping("/hello")
    @ResponseBody
    public String get() {
        return feignService.hello();
    }




}

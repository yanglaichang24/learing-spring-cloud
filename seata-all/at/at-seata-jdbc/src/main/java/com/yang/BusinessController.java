package com.yang;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class BusinessController {

    @Resource
    private BusinessService businessService;

    @Resource
    private StorageService storageService;

    @GetMapping("/busi")
    public String business(){
        businessService.purchase("U100001", "C00321", 1);
        return "ok";
    }

    @GetMapping("/stock")
    public String stock(){
        storageService.deduct("C00321", 1);
        return "ok";
    }



}

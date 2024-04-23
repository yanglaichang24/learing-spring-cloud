package com.yang;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    @GetMapping("/o/get")
    public String getOrder(){
        return "getOrder";
    }

    @GetMapping("/o/add")
    public String addOrder(){
        return "addOrder";
    }

}

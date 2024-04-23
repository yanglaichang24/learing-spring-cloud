package com.yang;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StockController {

    @GetMapping("/s/get")
    public String getStock(){
        return "getStock";
    }

    @GetMapping("/s/add")
    public String addStock(){
        return "addStock";
    }

}

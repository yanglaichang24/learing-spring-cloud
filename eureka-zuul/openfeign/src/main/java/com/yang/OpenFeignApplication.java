package com.yang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author Mr.Yang
 * @desc Application
 * @date 2023/2/15 15:19
 */

@EnableFeignClients
@SpringBootApplication
public class OpenFeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(OpenFeignApplication.class,args);
    }

}

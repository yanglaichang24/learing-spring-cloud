package com.yang;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/***
 * @Author 徐庶   QQ:1092002729
 * @Slogan 致敬大师，致敬未来的你
 */
@RestController
@RequestMapping("/sentinel")
public class SentinelController {

    @Resource
    private SentinelService sentinelService;

    @RequestMapping("/{id}")
    public String get(@PathVariable Integer id) {
        return "sentinel" + id;
    }

    @RequestMapping("/hello/{id}")
    public String hello(@PathVariable Integer id) {
        return sentinelService.helloLimit(id);
    }

}

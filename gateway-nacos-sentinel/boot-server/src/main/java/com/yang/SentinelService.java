package com.yang;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/***
 * @Author 徐庶   QQ:1092002729
 * @Slogan 致敬大师，致敬未来的你
 * @SentinelResource 注解用来标识资源是否被限流、降级
 */
@Service
public class SentinelService {

    /*
      @SentinelResource 注解用来标识资源是否被限流、降级
      一般推荐将 @SentinelResource 注解加到服务实现上，而在 Web 层直接使用 Spring Cloud Alibaba 自带的 Web 埋点适配。
      Sentinel Web 适配同样支持配置自定义流控处理逻辑
    * */
    @SentinelResource("Sentinel")
    public String helloLimit(@PathVariable Integer id){
        return "sentinel" + id;
    }

}

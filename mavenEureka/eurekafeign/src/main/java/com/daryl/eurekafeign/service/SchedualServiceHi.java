package com.daryl.eurekafeign.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 负载均衡、断路器:Hystrix 仪表盘
 */
@FeignClient(value = "service-client",fallback = SchedualServiceHiHystric.class)
public interface SchedualServiceHi {

    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value = "name") String name);


    /**
     * feign调用外部用户中心服务接口
     * @FeignClient(url="${userCenter.url}",name="userCenter")
     *
     * 调用内部已注册服务
     * @FeignClient("service-client")
     */
}

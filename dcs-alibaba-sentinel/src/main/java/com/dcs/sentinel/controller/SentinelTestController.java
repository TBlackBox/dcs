package com.dcs.sentinel.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SentinelTestController {

    @GetMapping("/test1")
    public Object test1(){

        return "sentinel test 1";
    }

    @GetMapping("/test2")
    public Object test2(){

        return "sentinel test 2";
    }

    @GetMapping("/test3")
    public Object test3(){

        return "sentinel test 3";
    }

    @GetMapping("/testResource")
    @SentinelResource(value = "testSentinelResource",blockHandler="customHandleethod",fallback = "customHandleethod")
    public Object testResource(){

        return "哈哈  我是业务方法";
    }

    public Object customHandleethod(BlockException ex){

        return "BlockException 抛出了异常，也就是在sentinel后台配置的信息";
    }

    public Object customHandleethod(){
        return "代码级别抛出异常，也就是业务出异常了";
    }

}

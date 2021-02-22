package com.dcs.payment.controller;

import com.google.inject.internal.cglib.core.$ObjectSwitchCallback;
import jdk.nashorn.internal.objects.annotations.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payment")
public class PaymentController {

    @Value("${server.port}")
    private int serverPost;

    @GetMapping("/version")
    public Object getVersion(){
        return "该版本是1.0，端口号是：" + serverPost;
    }

    @GetMapping("/port")
    public Object getPort(){
        System.out.println("进入获取端口号的方法");
        return "服务的端口号为：" + serverPost;
    }
}

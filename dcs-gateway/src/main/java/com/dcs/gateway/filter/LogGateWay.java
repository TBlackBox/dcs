package com.dcs.gateway.filter;

import org.apache.http.HttpStatus;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

import java.time.ZonedDateTime;

@Component
public class LogGateWay implements GlobalFilter, Ordered {
    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {

        System.out.println("*******进如全局过滤器：当前时间：" + ZonedDateTime.now());

        String name = exchange.getRequest().getRemoteAddress().getHostName();

        //在这点就可以做一些过滤
        if(name == null){
            //如果条件不成立，这点就可以返回
            //设置返回状态
            exchange.getResponse().setRawStatusCode(HttpStatus.SC_BAD_GATEWAY);
            return exchange.getResponse().setComplete();
        }

        System.out.println("********链路继续执行");
        //条件成立的话  就让链路继续执行
        return chain.filter(exchange);
    }

    /**
     * 这里返回顺序，顺序越小，越在前面  范围就是Integer 的最大值和最小值
     * @return
     */
    @Override
    public int getOrder() {
        return 0;
    }
}

package com.alpha.consumer.remote;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by jiming.jing on 2020/5/20.
 */
@Component
public class HelloRemoteHystrix implements HelloRemote {
    @Override
    public String hello2(@RequestParam(value = "name") String name) {
        return "hello " + name + ", this messge send failed ";
    }
}

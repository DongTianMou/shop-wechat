package com.dogtian.shopmember.serviceImp;

import com.dongtian.shopapi.service.member.DemoService;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class DemoServiceImp implements DemoService {

    @Override
    public String hello() {
        return "hello";
    }

    @Override
    public Map<String, Object> setKey() {
        System.out.println("set key success");
        return null;
    }

    @Override
    public Map<String, Object> getKey() {
        System.out.println("get key success");
        return null;
    }
}

package com.dogtian.shopmember.serviceImp;

import com.dongtian.shopapi.service.member.DemoService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoServiceImp implements DemoService {

    @Override
    public String hello() {
        return "hello";
    }
}

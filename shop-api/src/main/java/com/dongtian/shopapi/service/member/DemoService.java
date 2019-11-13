package com.dongtian.shopapi.service.member;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/demo")
public interface DemoService {
    @GetMapping("/hello")
    public String hello();
}

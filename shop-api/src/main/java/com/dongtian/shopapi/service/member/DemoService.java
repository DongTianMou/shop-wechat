package com.dongtian.shopapi.service.member;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@RequestMapping("/demo")
public interface DemoService {
    @GetMapping("/hello")
    public String hello();
    @GetMapping("/setKey")
    public Map<String,Object> setKey();
    @GetMapping("/getKey")
    public Map<String,Object> getKey();

}

package com.example.commitmessagetest.test.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @RequestMapping("/hello")
    public String hello(@RequestParam("name") String name) {
        return "Hello " + name;
    }

    @RequestMapping("/qrCodeV2")
    public String qrCodeV2() {
        return "解决了二维码V2版本问题";
    }
}

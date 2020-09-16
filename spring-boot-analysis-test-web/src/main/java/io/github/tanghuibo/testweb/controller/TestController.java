package io.github.tanghuibo.testweb.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author tanghuibo
 * @date 2020/9/16下午11:44
 */
@RestController
@RequestMapping("test")
public class TestController {

    @GetMapping("hello")
    public String hello() {
        return "hello";
    }
}

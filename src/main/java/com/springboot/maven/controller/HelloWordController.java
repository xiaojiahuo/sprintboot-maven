package com.springboot.maven.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author huang
 * @date 2018-08-16
 */
@RestController
@RequestMapping("/v1")
public class HelloWordController {

    private final static Logger log = LoggerFactory.getLogger(HelloWordController.class);

    private String str = "ni: * ";

    @GetMapping("/say/{content}")
    public String sayHello(@PathVariable String content) {
        log.info("content =>> {}", str + content);
        return str + content;
    }
}

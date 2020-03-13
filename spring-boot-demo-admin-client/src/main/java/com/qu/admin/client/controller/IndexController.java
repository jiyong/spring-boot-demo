package com.qu.admin.client.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jiyong.me
 * @version 1.0.0
 * @ClassName IndexController.java
 * @package {PACKAGE_NAME}
 * @createTime 2020/03/13
 */
@RestController
public class IndexController {
    @GetMapping(value = {"", "/"})
    public String index() {
        return "This is a Spring Boot Admin Client";
    }
}

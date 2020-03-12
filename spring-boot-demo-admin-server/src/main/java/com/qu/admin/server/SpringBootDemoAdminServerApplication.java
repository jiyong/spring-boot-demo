package com.qu.admin.server;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author jiyong.me
 * @version 1.0.0
 * @ClassName SpringBootDemoAdminServerApplication.java
 * @package {PACKAGE_NAME}
 * @Description Spring Boot Admin Server Demo
 * @createTime 2020/03/12
 */
@EnableAdminServer
@SpringBootApplication
public class SpringBootDemoAdminServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootDemoAdminServerApplication.class, args);
    }
}

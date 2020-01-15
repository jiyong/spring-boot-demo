# spring-boot-demo-actuator
> 本项目演示在Spring Boot中通过actuator监视项目的运行情况

## pom.xml
```xml
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <parent>
        <artifactId>spring-boot-demo</artifactId>
        <groupId>com.qu</groupId>
        <version>1.0-SNAPSHOT</version>
    </parent>
    <modelVersion>4.0.0</modelVersion>

    <artifactId>spring-boot-demo-actuator</artifactId>
    <version>1.0-SNAPSHOT</version>
    <packaging>jar</packaging>

    <properties>
        <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
        <project.reporting.outputEncoding>UTF-8</project.reporting.outputEncoding>
        <java.version>1.8</java.version>
    </properties>

    <dependencies>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-actuator</artifactId>
        </dependency>

        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-security</artifactId>
        </dependency>

        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web</artifactId>
        </dependency>

        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-test</artifactId>
        </dependency>

        <dependency>
            <groupId>org.springframework.security</groupId>
            <artifactId>spring-security-test</artifactId>
        </dependency>
    </dependencies>

    <build>
        <finalName>spring-boot-actuator</finalName>
        <plugins>
            <plugin>
                <groupId>org.springframework.boot</groupId>
                <artifactId>spring-boot-maven-plugin</artifactId>
            </plugin>
        </plugins>
    </build>



</project>
```

## application.yml
```yml
server:
  port: 8080
  servlet:
    context-path: /demo
# 访问端点信息，需要配置用户名和密码
spring:
  security:
    user:
      name: qu
      password: 123456
management:
  # 端点信息接口使用的端口，为了和主系统接口使用的端口进行分离
  server:
    port: 8090
    servlet:
      context-path: /sys
  # 端点健康情况，默认值"never", 设置为"always"可以显示硬盘使用情况和线程情况
  endpoint:
    health:
      show-details: always
  # 设置端点暴露的内容，默认值["health", "info"], "*"代表暴露有所可访问的端点，详细参考https://docs.spring.io/spring-boot/docs/current/reference/html/production-ready-features.html#production-ready-endpoints
  endpoints:
    web:
      exposure:
        include: '*'
```

## 端点暴露情况
在项目启动后，可查看可访问端口（参考配置文件）
1. 权限控制 spring security
2. 根据配置和actuator默认，所有访问都在带/sys/actuator前缀
3. 访问http://localhost:8090/sys/actuator/health，输入用户名密码(qu/123456)， 即可查看health
4. 其他端点请参考文档描述

## 参考文档
- https://docs.spring.io/spring-boot/docs/current/reference/html/production-ready-features.html#production-ready-enabling
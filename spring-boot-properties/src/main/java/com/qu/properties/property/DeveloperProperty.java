package com.qu.properties.property;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @package: com.qu.properties.property
 * @description: 开发人员配置信息
 * @author: jiyong.me
 * @copyright: Copyright (c) 2018
 * @version: V1.0
 * @modified: jiyong.me
 * @created: 2020/01/07 09:10
 */
@Data
@ConfigurationProperties(prefix = "developer")
@Component
public class DeveloperProperty {
    private String name;
    private String website;
    private String qq;
    private String phoneNumber;
}

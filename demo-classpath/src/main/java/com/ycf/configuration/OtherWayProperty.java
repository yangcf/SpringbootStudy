/**
 * Copyright 2017 超凡. All rights reserved
 * Project Name:springboot-demo
 * Module Name:Core
 */
package com.ycf.configuration;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * what:   映射属性 <br/>
 *
 * @author 杨超凡 created on 2017/12/25
 */
@Data
@ConfigurationProperties(prefix = "spring.datasource")
public class OtherWayProperty {
    private String url;
    private String username;
    private String password;
    private String driverClassName;
    private String max_active;
    private String max_idle;
    private String min_idle;
    private String initial_size;
}

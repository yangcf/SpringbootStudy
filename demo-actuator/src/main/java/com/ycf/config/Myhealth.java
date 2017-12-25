/**
 * Copyright 2017 超凡. All rights reserved
 * Project Name:springboot-demo
 * Module Name:Core
 */
package com.ycf.config;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

/**
 * what:  自定义健康检查. <br/>
 *
 * @author 杨超凡 created on 2017/12/25
 */
@Component
public class Myhealth implements HealthIndicator {

    @Override
    public Health health() {
        int errorCode = 0; // perform some specific health check
        if (errorCode != 0) {
            return Health.down().withDetail("Error Code", errorCode).build();
        }
        return Health.up().build();
    }
}

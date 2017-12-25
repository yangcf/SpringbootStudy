/**
 * Copyright 2017 超凡. All rights reserved
 * Project Name:springboot-demo
 * Module Name:Core
 */
package com.ycf.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * what:   属性注入的另一种方式 <br/>
 *
 * @author 杨超凡 created on 2017/12/25
 */
@Configuration
@ConditionalOnClass(OtherWayProperty.class)
@EnableConfigurationProperties(OtherWayProperty.class)
public class OtherWayAutoConfig {
    @Autowired
    OtherWayProperty otherWayProperty;
}

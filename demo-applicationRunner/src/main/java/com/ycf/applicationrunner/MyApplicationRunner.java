/**
 * Copyright 2017 超凡. All rights reserved
 * Project Name:springboot-demo
 * Module Name:Core
 */
package com.ycf.applicationrunner;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * what:    ApplicationRunner. <br/>
 *
 * ps：经过测试，ApplicationRunner在order相同时会优先于CommandLineRunner执行
 *
 * @author 杨超凡 created on 2017/12/25
 */
@Component
@Order(value = 2)
public class MyApplicationRunner implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments applicationArguments) throws Exception {
        System.out.println(">>>>>>>>>>>>>>>>>>>>>MyApplicationRunner执行<<<<<<<<<<<<<<<<<<<<<");
    }
}

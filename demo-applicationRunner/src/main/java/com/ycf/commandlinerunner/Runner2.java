/**
 * Copyright 2017 超凡. All rights reserved
 * Project Name:springboot-demo
 * Module Name:Core
 */
package com.ycf.commandlinerunner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * what: 增加顺序控制. <br/>
 *
 * @author 杨超凡 created on 2017/12/25
 */
@Component
@Order(value = 2)
public class Runner2 implements CommandLineRunner {

    @Override
    public void run(String... strings) throws Exception {
        System.out.print("这里输出main参数：");
        System.out.println(Arrays.asList(strings));
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>Runner2执行>>>>222222222222222222222<<<<<<<<");
    }
}

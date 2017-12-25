/**
 * Copyright 2017 超凡. All rights reserved
 * Project Name:springboot-demo
 * Module Name:Core
 */
package com.ycf.commandlinerunner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * what:  增加顺序控制. <br/>
 *
 * @author 杨超凡 created on 2017/12/25
 */
@Component
@Order(value = 1)
public class Runner1 implements CommandLineRunner{

    @Override
    public void run(String... strings) throws Exception {
        System.out.println(">>>>>>>>>>>>>>>>>Runner1执行>>111111111111111111111111<<<<<<<<");
    }
}

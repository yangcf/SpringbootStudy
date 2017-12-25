/**
 * Copyright 2017 超凡. All rights reserved
 * Project Name:springboot-demo
 * Module Name:Core
 */
package com.ycf.commandlinerunner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * what: 服务启动后会执行. <br/>
 *
 * @author 杨超凡 created on 2017/12/25
 */
@Component
public class MyCommandLineRunner implements CommandLineRunner{

    @Override
    public void run(String... strings) throws Exception {
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>服务启动执行CommandLineRunner<<<<<<<<<<<<<<<<<<");
    }
}

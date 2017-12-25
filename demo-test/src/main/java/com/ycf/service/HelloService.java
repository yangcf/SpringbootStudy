/**
 * Copyright 2017 超凡. All rights reserved
 * Project Name:springboot-demo
 * Module Name:Core
 */
package com.ycf.service;

import org.springframework.stereotype.Service;

/**
 * what:   用于显示测试效果. <br/>
 *
 * @author 杨超凡 created on 2017/12/25
 */
@Service
public class HelloService {
    public void getName() {
        System.out.println("测试效果展示！");
    }
}

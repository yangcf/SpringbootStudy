/**
 * Copyright 2017 超凡. All rights reserved
 * Project Name:springboot-demo
 * Module Name:Core
 */
package com.ycf.configuration;

import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.ehcache.EhCacheCacheManager;
import org.springframework.cache.ehcache.EhCacheManagerFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;

/**
 * what:  缓存配置类. <br/>
 *
 * @author 杨超凡 created on 2017/12/25
 */
@Configuration
@EnableCaching
public class CacheConfiguration {

    @Bean
    public EhCacheCacheManager ehCacheCacheManager(EhCacheManagerFactoryBean ehCacheManagerFactoryBean){
        System.out.println("配置缓存成功！");
        return new EhCacheCacheManager(ehCacheManagerFactoryBean.getObject());
    }

    /*
       * 据shared与否的设置,
       * Spring分别通过CacheManager.create()
       * 或new CacheManager()方式来创建一个ehcache基地.
       *
       * 也说是说通过这个来设置cache的基地是这里的Spring独用,还是跟别的(如hibernate的Ehcache共享)
       *
       */
    @Bean
    public EhCacheManagerFactoryBean ehCacheManagerFactoryBean(){
        System.out.println("CacheConfiguration.ehCacheManagerFactoryBean()");
        EhCacheManagerFactoryBean cacheManagerFactoryBean = new EhCacheManagerFactoryBean ();
        cacheManagerFactoryBean.setConfigLocation (new ClassPathResource("conf/ehcache.xml"));
        cacheManagerFactoryBean.setShared(true);
        return cacheManagerFactoryBean;
    }
}

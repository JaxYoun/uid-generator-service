package com.yang.uidgenerator.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * @author: Yang
 * @date: 2019/10/5 03:48
 * @description:
 */
@Configuration
@MapperScan(basePackages = "com.yang.uidgenerator.uid.worker.dao")
@ImportResource(locations = {"classpath:uid/cached-uid-spring.xml"})
//@ImportResource(locations = {"classpath:uid/default-uid-spring.xml"})
public class UidConfig {
}

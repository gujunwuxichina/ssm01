package com.gujun.config;

import org.springframework.context.annotation.ComponentScan;

/**
 * @ClassName gu
 * @Description TODO
 * @Author GuJun
 * @Date 2019/7/29 21:10
 * @Version 1.0
 **/
//有两个配置项：
//1.basePackages，配置一个Java包的数组，Spring会根据其来扫描对应的包和子包；
//2.basePackageClasses，可以配置多个类，Spring会根据这些类所在的包及其子包来扫描；
@ComponentScan(basePackages={"com.gujun.beans"})
public class SpringConfig {
}

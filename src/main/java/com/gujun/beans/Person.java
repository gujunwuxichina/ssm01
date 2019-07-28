package com.gujun.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * @ClassName gu
 * @Description TODO
 * @Author GuJun
 * @Date 2019/7/28 17:17
 * @Version 1.0
 **/
public class Person implements BeanNameAware, ApplicationContextAware, InitializingBean, DisposableBean {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person() {
    }

    public void show(){
        System.out.println("my name is "+name);
    }

    public void initMethod(){
        System.out.println("自定义初始化方法");
    }

    public void destroyMethod(){
        System.out.println("自定义销毁方法");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("bean id is "+s);
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("销毁方法");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("afterPropertiesSet()");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("获取容器实例方法");
    }
}

package com.gujun.beans;

import org.springframework.beans.factory.BeanNameAware;

/**
 * @ClassName gu
 * @Description TODO
 * @Author GuJun
 * @Date 2019/7/28 22:04
 * @Version 1.0
 **/
public class BeanXml01 implements BeanNameAware {

    private String beanName;

    @Override
    public void setBeanName(String s) {
        this.beanName=s;
    }

    public void show(){
        System.out.println("Bean的编号:"+beanName);
    }

}

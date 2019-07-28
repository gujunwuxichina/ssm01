package com.gujun.test;

import com.gujun.beans.JuiceMaker;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName gu
 * @Description TODO
 * @Author GuJun
 * @Date 2019/7/28 15:50
 * @Version 1.0
 **/
public class Test01 {

    //Spring IoC容器，控制反转，依赖注入  入门实例
    @Test
    public void test01(){
        ApplicationContext ctx=new ClassPathXmlApplicationContext("beans01.xml");
        JuiceMaker juiceMaker= (JuiceMaker) ctx.getBean("juiceMaker");
        juiceMaker.show();
    }

    //SpringIoC容器：
    //IoC容器主要基于BeanFactory和ApplicationContext两个接口；
    //ApplicationContext是BeanFactory的子接口之一；对BeanFactory功能进行了扩展，一般都是以ApplicationContext；
    //BeanFactory接口中的一些方法：
    //Object getBean(name)；<T> T getBean(Class<T>)；
    //containsBean(name)；getAliases(name)获取别名；
    //isSingleton(name)，判断是否单例，若是则该Bean在容器中作为唯一的单例存在；
    //isPrototype(name)，则相反，若是，则意味着从容器中获取Bean时，容器会为你生成一个新的实例；
    //Spring默认下都是单例，即isSingleton返回true,isPrototype返回false;

}

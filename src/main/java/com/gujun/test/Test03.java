package com.gujun.test;

import com.gujun.beans.BeanXml01;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName gu
 * @Description TODO
 * @Author GuJun
 * @Date 2019/7/28 21:30
 * @Version 1.0
 **/
public class Test03 {

    //依赖注入：
    //构造器注入（index属性指定第几个参数，从0开始）、setter注入是主要方式；
    //接口注入，是从别的地方注入；如：web工程中，数据源通过tomcat服务器配置的，
    //此时用JNDI的形式通过接口注入进IoC容器中；

    //装配Bean：
    //3种配置方式：
    //1.xml中配置；2.在Java接口或类中配置（Java代码配置）；3.隐式扫描发现机制和自动装配原则；
    //三种方式如何选择：
    //1.优先扫描发现方式和自动配置方式；
    //2.在没有使用自动配置的情况下优先考虑Java接口或类配置；比如：一个父类有多个子类，就可以使用Java配置指定子类；
    //3.对于第三方类库，推荐xml配置；

    //xml配置：id属性即Bean的编号，不是必须的，如果不配置Spring采用全限类名#编号(从0开始)的格式来生成编号；
    @Test
    public void test01(){
        ApplicationContext ctx=new ClassPathXmlApplicationContext("beansByXml.xml");
        BeanXml01 beanXml01=ctx.getBean(BeanXml01.class);
        beanXml01.show();
    }
    //装配集合：
    //List属性为对应的<list>进行装配，然后通过<value>设置值；
    //Map属性对应<map>进行装配，通过多个<entry>的key属性和value属性设置key和value;
    //Properties，对应的<props>进行装配，然后通过<prop key=“”>value</prop>设置key和value;
    //Set属性对应的<set>进行装配，然后通过<value>设置值；
    //对于数组，使用<array>装配，<value>设置值；
    //以上对于值是普通类型或字符串，如果是引用类型；改为<ref bean=“”>和<entry key-ref="" value-ref=""/>
    //命名空间装配：HH(简化配置法)

}

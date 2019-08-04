package com.gujun.loadProperties;

import com.gujun.beans.Man;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName gu
 * @Description TODO
 * @Author GuJun
 * @Date 2019/8/4 9:47
 * @Version 1.0
 **/
public class Test02 {

    //加载属性文件,xml配置：
    //使用<context:property-placeholder>加载一些配置项即可；
    @Test
    public void test01(){
        ApplicationContext context=new ClassPathXmlApplicationContext("spring-properties.xml");
        Man man=context.getBean(Man.class);
        man.show();
    }

}

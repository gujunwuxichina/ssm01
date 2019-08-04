package com.gujun.loadProperties;

import com.gujun.beans.Man;
import com.gujun.config.SpringConfig01;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @ClassName gu
 * @Description TODO
 * @Author GuJun
 * @Date 2019/8/4 9:09
 * @Version 1.0
 **/
public class Test01 {

    //加载属性文件：可以通过注解或xml的方式来实现；
    //注解方式：
    //Spring提供了@PropertySource来加载属性文件；
        //配置项：
        //name,字符串，配置此次属性配置的名称；
        //value,字符串数组，可配置多个属性文件；
        //ignoreResourceNotFound，boolean;
        //encoding，编码，默认“”；

    @Test
    public void test01(){
        ApplicationContext context=new AnnotationConfigApplicationContext(SpringConfig01.class);
        System.out.println(context.getEnvironment().getProperty("name"));
        //仅仅像上面这样，Spring中没有解析属性占位符的能力，为此提供了一个属性文件解析类；
        //就是PropertySourcesPlaceholderConfigurer，使用它Spring就能解析对于的属性文件，并
        //通过占位符去引用对应的配置；@Bean配置  static方法；
        Man man= (Man) context.getBean("man");
        man.show();
    }

}

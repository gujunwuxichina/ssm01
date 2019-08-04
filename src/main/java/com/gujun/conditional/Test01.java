package com.gujun.conditional;

import com.gujun.beans.Man;
import org.junit.jupiter.api.Test;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @ClassName gu
 * @Description TODO
 * @Author GuJun
 * @Date 2019/8/4 10:27
 * @Version 1.0
 **/
public class Test01 {

    @Test
    public void test01(){
        ApplicationContext context=new AnnotationConfigApplicationContext(SpringConfig.class);
        try {
            Man man= context.getBean(Man.class);
            man.show();
        } catch (BeansException e) {
            System.out.println(e.getMessage());
        }

    }

}

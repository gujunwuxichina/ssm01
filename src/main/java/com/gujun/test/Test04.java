package com.gujun.test;

import com.gujun.beans.Game;
import com.gujun.config.SpringConfig;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @ClassName gu
 * @Description TODO
 * @Author GuJun
 * @Date 2019/7/29 21:04
 * @Version 1.0
 **/
public class Test04 {

    //注解装配Bean
    @Test
    public void test01(){
        ApplicationContext context=new AnnotationConfigApplicationContext(SpringConfig.class);
        Game game= (Game) context.getBean("game");
        game.show();
    }

}

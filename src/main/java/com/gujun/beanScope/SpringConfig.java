package com.gujun.beanScope;

import com.gujun.beans.Game;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * @ClassName gu
 * @Description TODO
 * @Author GuJun
 * @Date 2019/8/4 10:55
 * @Version 1.0
 **/
@Configuration
public class SpringConfig {

    //Bean的作用域
    //单例，singleton,默认；
    //原型，prototype;
    //会话，session,web应用中，一次会话过程中只产生一个实例；
    //请求，rquest,一次请求一个实例，不同请求创建不同实例；

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE) //每个请求都是不同实例
    public Game game(){
        return  new Game();
    }

}

package com.gujun.conditional;

import com.gujun.beans.Man;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @ClassName gu
 * @Description TODO
 * @Author GuJun
 * @Date 2019/8/4 10:21
 * @Version 1.0
 **/
@Configuration
@PropertySource(value ={"classpath:02.properties"},ignoreResourceNotFound =true)
public class SpringConfig {

    @Bean(name="man")
    @Conditional({ManCondition.class})
    public Man man(@Value("${name}") String name,@Value("${age}") int age){
        Man man=new Man();
        man.setName(name);
        man.setAge(age);
        return man;
    }

    public static PropertyPlaceholderConfigurer propertyPlaceholderConfigurer(){
        return new PropertyPlaceholderConfigurer();
    }

}

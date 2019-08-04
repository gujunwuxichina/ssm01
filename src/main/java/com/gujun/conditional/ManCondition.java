package com.gujun.conditional;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @ClassName gu
 * @Description TODO
 * @Author GuJun
 * @Date 2019/8/4 10:23
 * @Version 1.0
 **/
public class ManCondition implements Condition {
    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        //方法两个参数，第一个可以获得Spring运行环境，第二个获得该Bean的注解信息；
        Environment environment=conditionContext.getEnvironment();
        //只有在配置文件中，这两个属性配置都有时才会装配指定Bean;
        return environment.containsProperty("name")&&environment.containsProperty("age");
    }
}

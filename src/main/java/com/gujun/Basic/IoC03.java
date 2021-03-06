package com.gujun.Basic;

/**
 * @ClassName gu
 * @Description TODO
 * @Author GuJun
 * @Date 2019/7/31 21:45
 * @Version 1.0
 **/
public class IoC03 {

    //自动装配：
    //@Autowired，Spring会根据类型去寻找，并将其注入；
    //如果寻找失败，就会抛出异常，此时可以配置属性require=false来设为不是必须的；
    //@Autowired也可以修饰setter()；

    //自动装配的奇异性：
    //Spring建议使用接口编程，即@Autowired修饰的接口类型，但是接口实现类并一定只有一个；
    //为此Spring提供了@Primary、@Qualifier；
    //@Primary代表首要的，修饰Bean，自动注入会优先选择；不推荐
    //@Qualifier(id)，即采用名称（id）来注入；
    //@Autowired和@Qualifier还支持构造器参数；

    //使用@Bean装配Bean:
    //修饰方法，将方法返回的对象作为Bean;也可以通过@Autowired或@Qualifier注入到别的Bean中；
    //配置属性：name,一个字符串数组，允许配置多个BeanName；
    //initMethod/destroyMethod，自定义初始化/销毁方法；

    //装配的混合使用：
    //自己开发的类使用注解，第三方用xml;
    //可以在配置类通过@ImportResource引入xml配置文件；其内容是一个字符串数组，可以引入多个xml文件；
    //如：@ImportResource({"classpath:",""...})
    //对于多个配置类，可以通过@Import引入配置类，如：@Import({xxx.class,...})
    //多个XML，想其中一个xml引入其他xml,如：<import resource="xxx.xml"/>
    //xml文件加载Java配置类，可以将配置类当作普通Bean即可；不推荐
    //上面也可以在xml中配置扫描包类模拟配置类的功能，如：<context:component-scan base-package="xxxx"/>

}

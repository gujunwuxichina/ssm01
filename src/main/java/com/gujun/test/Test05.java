package com.gujun.test;

/**
 * @ClassName gu
 * @Description TODO
 * @Author GuJun
 * @Date 2019/7/31 21:45
 * @Version 1.0
 **/
public class Test05 {

    //自动装配：
    //@Autowired，Spring会根据类型去寻找，并将其注入；
    //如果寻找失败，就会抛出异常，此时可以配置属性require=false来设为不是必须的；
    //@Autowired也可以修饰setter()；

    //自动装配的奇异性：
    //Spring建议使用接口编程，即@Autowired修饰的接口类型，但是接口实现类并一定只有一个；
    //为此Spring提供了@Primary、@Qualifier；
    //@Primary代表首要的，修饰Bean，自动注入会优先选择；不推荐
    //@Qualifier(id)，即采用名称（id）来注入；

}

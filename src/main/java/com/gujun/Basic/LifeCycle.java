package com.gujun.Basic;

import com.gujun.beans.Person;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName gu
 * @Description TODO
 * @Author GuJun
 * @Date 2019/7/28 16:06
 * @Version 1.0
 **/
public class LifeCycle {

    //Spring IoC容器的初始化和依赖注入：
    //Bean的定义和初始化在Spring IoC容器是两大步骤，先是定义，然后是初始化和依赖注入;
    //Bean的定义分为三部：
    //1.Resource定位，此时容器根据配置进行资源定位；
    //2.BeanDefinition的载入，此时将Resource定位到的信息，保存到Bean定义中(BeanDefinition),并不会创建Bean实例；
    //3.BeanDefinition注册，此时将BeanDefinition的信息发布到IoC容器中，此时仍未创建Bean实例；
    //other plus:Spring Bean还有个配置项lazy-init，即是否初始化该Bean,默认值为false,
    //即IoC容器会自动初始化该Bean，若设为true则只有通过getBean()获取该Bean时才会进行初始化；

    //Spring Bean的生命周期：
    //生命周期是为了了解IoC容器初始化和销毁Bean的过程，通过了解它就可以知道如何
    //在初始化和销毁时加入自定义方法来满足特定需求；
    //1.初始化(创建实例);2.依赖注入;
    //3.若实现了BeanNameAware接口，调用setBeanName()；用来获取Bean的id;
    //4.若实现了BeanFactoryAware接口，调用setBeanFactory()；
    //5.若实现了ApplicationContextAware接口，则调用setApplicationContext()；容器必须是ApplicationContext的实现类；
    //6.若实现了BeanPostProcessor接口，则调用postProcessorBeforeInitialization()；针对所有Bean;（后处理器）
    //7.若实现了InitializingBean接口，则调用afterPropertiesSet()
    //8.自定义初始化方法，可以使用注解@PostConstruct或xml的属性配置(init-method)；
    //9.若实现了BeanPostProcessor接口，则调用postProcessorAfterInitialization()；针对所有Bean;（后处理器）
    //10.生存期,对外提供服务；
    //11.若实现了DisposableBean接口,则调用destroy()；
    //12.自定义销毁方法,可以使用注解@PreDestory或xml属性配置（destroy-method）；

    @Test
    public void test01(){
        ApplicationContext ctx=new ClassPathXmlApplicationContext("beans02.xml");
        Person person= (Person) ctx.getBean("person");
        person.show();
        if(ctx instanceof ClassPathXmlApplicationContext){
           ((ClassPathXmlApplicationContext) ctx).close();
        }
    }

}

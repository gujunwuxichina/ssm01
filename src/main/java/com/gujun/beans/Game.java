package com.gujun.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

/**
 * @ClassName gu
 * @Description TODO
 * @Author GuJun
 * @Date 2019/7/29 21:14
 * @Version 1.0
 **/
//@Component代表IoC会把该类扫描成Bean实例；
//value属性即id,可以简写成("game")，也可以不写，不写的话即默认类名首字母小写；
@Component(value="game")
public class Game {

    @Value("辐射4")
    private String name;

    @Value("24.00") //代表值注入，注入简单值，Spring会自动为其转换类型；
    private double price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void show(){
        System.out.println(name+"价格:"+price);
    }

}

package com.gujun.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @ClassName gu
 * @Description TODO
 * @Author GuJun
 * @Date 2019/8/4 9:33
 * @Version 1.0
 **/
@Component
public class Man {

    @Value("${name}")
    private String name;

    @Value("${age}")
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Man() {
    }

    public void show(){
        System.out.println("名字:"+name+",年龄:"+age);
    }

}

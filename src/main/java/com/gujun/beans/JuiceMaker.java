package com.gujun.beans;

/**
 * @ClassName gu
 * @Description TODO
 * @Author GuJun
 * @Date 2019/7/28 15:46
 * @Version 1.0
 **/
public class JuiceMaker {

    private String shop;

    private Source source;

    public String getShop() {
        return shop;
    }

    public void setShop(String shop) {
        this.shop = shop;
    }

    public Source getSource() {
        return source;
    }

    public void setSource(Source source) {
        this.source = source;
    }

    public JuiceMaker() {
    }

    public void show(){
        System.out.println("这是来自"+shop+"的"+source.getFruit()+"饮料");
    }

}

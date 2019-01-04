package com.design.demo.proxy;

/**
 * Created by gaoxiang on 19/1/4.
 */
public class ProxySubject implements Subject{

    public void buyMac() {
        //调用真实对象的方法，进行代理购买Mac
        RealSubject realSubject = new RealSubject();
        realSubject.buyMac();
        //代理对象额外做的操作
        this.wrapMac();
    }

    private void wrapMac() {
        System.out.println("用盒子包装好Mac");
    }
}
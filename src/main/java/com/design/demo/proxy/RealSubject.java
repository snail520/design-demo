package com.design.demo.proxy;

/**
 * Created by gaoxiang on 19/1/4.
 */
public class RealSubject implements Subject {

    public void buyMac() {
        System.out.println("买一台Mac");
    }
}

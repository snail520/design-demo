package com.design.demo.builder;

/**
 * Created by gaoxiang on 19/1/3.
 */
public class Director {

    //指挥装机人员组装电脑
    public void Construct(Builder builder){
        builder.buildCPU();
        builder.buildMainboard();
        builder.buildHD();
    }
}

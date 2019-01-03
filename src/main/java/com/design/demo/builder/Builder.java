package com.design.demo.builder;

/**
 * Created by gaoxiang on 19/1/3.
 */
public abstract class Builder {

    //装cpu
    public abstract void buildCPU();
    //装主板
    public abstract void buildMainboard();
    //装硬盘
    public abstract void buildHD();
    //装系统
    public abstract void buildSys();
    //获取组装好的电脑
    public abstract Computer getComputer();
}

package com.design.demo.adapter;

/**
 * Created by gaoxiang on 19/1/9.
 */
public class AdapterVoltage extends SourceVoltage implements TargetVoltage{

    @Override
    public void convert110V() {
        this.source220V();
        System.out.println("已转换源电压220V为110V");
    }
}

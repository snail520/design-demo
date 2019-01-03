package com.design.demo.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by gaoxiang on 19/1/3.
 */
public class Computer {
    List<String> list = new ArrayList<String>();

    public void addPart(String part) {
        list.add(part);
    }

    public void show(){
        for(int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("电脑组装好了");
    }
}

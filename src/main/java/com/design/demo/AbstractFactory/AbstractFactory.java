package com.design.demo.AbstractFactory;

/**
 * Created by gaoxiang on 19/1/2.
 */
public abstract class AbstractFactory {
    abstract Shape getShape(String type);
    abstract Color getColor(String type);
}

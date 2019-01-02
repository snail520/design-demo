package com.design.demo.AbstractFactory;

/**
 * Created by gaoxiang on 19/1/2.
 */
public class FactoryProductor {
    static AbstractFactory getFactory(String type){
        if(type.equalsIgnoreCase("shape")){
            return new ShapeFactory();
        }else if(type.equalsIgnoreCase("color")){
            return new ColorFactory();
        }
        return null;
    }
}

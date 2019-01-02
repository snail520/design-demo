package com.design.demo.AbstractFactory;

/**
 * Created by gaoxiang on 19/1/2.
 */
public class ColorFactory extends AbstractFactory{
    Shape getShape(String type) {
        return null;
    }

    Color getColor(String type){
        if(type.equalsIgnoreCase("red")){
            return new RedColor();
        }else if (type.equalsIgnoreCase("green")){
            return new GreenColor();
        }else if (type.equalsIgnoreCase("yellow")){
            return new YellowColor();
        }
        return null;
    }
}

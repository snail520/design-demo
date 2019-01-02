package com.design.demo.AbstractFactory;

/**
 * Created by gaoxiang on 19/1/2.
 */
public class ShapeFactory extends AbstractFactory{

    Shape getShape(String type){
        if(type.equalsIgnoreCase("circle")){
            return new CircleShape();
        }else if(type.equalsIgnoreCase("rectangle")){
            return new RectangleShape();
        }else if(type.equalsIgnoreCase("square")){
            return new SquareShape();
        }
        return null;
    }

    Color getColor(String type) {
        return null;
    }
}

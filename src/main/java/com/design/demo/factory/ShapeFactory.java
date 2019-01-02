package com.design.demo.factory;

/**
 * Created by gaoxiang on 19/1/2.
 */
public class ShapeFactory {

    Shape getShape(String shape){
        if(shape.equalsIgnoreCase("CIRCLE")){
            return new CircleShape();
        }else if(shape.equalsIgnoreCase("RECTANGLE")){
            return new RectangleShape();
        }else if(shape.equalsIgnoreCase("SQUARE")){
            return new SquareShape();
        }
        return null;
    }
}

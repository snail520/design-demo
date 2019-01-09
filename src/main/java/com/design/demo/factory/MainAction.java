package com.design.demo.factory;

/**
 * 工厂模式(创建型模式) 选择
 * 主要解决：主要解决接口选择的问题
 * 应用实例： 1、您需要一辆汽车，可以直接从工厂里面提货，而不用去管这辆汽车是怎么做出来的，以及这个汽车里面的具体实现。
 *           2、Hibernate 换数据库只需换方言和驱动就可以
 * 优点：1、一个调用者想创建一个对象，只要知道其名称就可以了。
 *      2、扩展性高，如果想增加一个产品，只要扩展一个工厂类就可以。
 *      3、屏蔽产品的具体实现，调用者只关心产品的接口。
 * 缺点：每次增加一个产品时，都需要增加一个具体类和对象实现工厂，使得系统中类的个数成倍增加，在一定程度上增加了系统的复杂度，同时也增加了系统具体类的依赖
 *
 *
 * 示例：不同形状返回不同方法
 */


public class MainAction {

    public static void main(String[] args) {
        ShapeFactory shape = new ShapeFactory();
        Shape shape1 = shape.getShape("CIRCLE");
        System.out.println(shape1.draw());

        Shape shape2 = shape.getShape("RECTANGLE");
        System.out.println(shape2.draw());

        Shape shape3 = shape.getShape("SQUARE");
        System.out.println(shape3.draw());
    }
}

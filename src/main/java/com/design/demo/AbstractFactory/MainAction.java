package com.design.demo.AbstractFactory;


/**
 * 抽象工厂模式(创建型模式)
 * 主要解决：主要解决接口选择的问题
 * 应用实例： 工作了，为了参加一些聚会，肯定有两套或多套衣服吧，比如说有商务装（成套，一系列具体产品）、时尚装（成套，一系列具体产品），
 *      甚至对于一个家庭来说，可能有商务女装、商务男装、时尚女装、时尚男装，这些也都是成套的，即一系列具体产品。假设一种情况（现实中是不存在的，
 *      要不然，没法进入共产主义了，但有利于说明抽象工厂模式），在您的家中，某一个衣柜（具体工厂）只能存放某一种这样的衣服（成套，一系列具体产品），
 *      每次拿这种成套的衣服时也自然要从这个衣柜中取出了。用 OO 的思想去理解，所有的衣柜（具体工厂）都是衣柜类的（抽象工厂）某一个，
 *      而每一件成套的衣服又包括具体的上衣（某一具体产品），裤子（某一具体产品），这些具体的上衣其实也都是上衣（抽象产品），
 *      具体的裤子也都是裤子（另一个抽象产品）
 * 优点：当一个产品族中的多个对象被设计成一起工作时，它能保证客户端始终只使用同一个产品族中的对象
 * 缺点：产品族扩展非常困难，要增加一个系列的某一产品，既要在抽象的 Creator 里加代码，又要在具体的里面加代码
 *
 *
 * 示例：想要形状时返回形状工厂，想要颜色时返回颜色工厂
 */
public class MainAction {
    public static void main(String[] args) {
        //获取形状工厂
        AbstractFactory abs = FactoryProductor.getFactory("shape");
        Shape shape = abs.getShape("circle");
        shape.draw();
        //获取颜色工厂
        AbstractFactory abs1 = FactoryProductor.getFactory("color");
        Color color = abs1.getColor("yellow");
        color.fill();
    }
}

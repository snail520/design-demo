package com.design.demo.builder;

/**
 * 建造者模式（创建型模式）
 * 主要解决：主要解决在软件系统中，有时候面临着"一个复杂对象"的创建工作，其通常由各个部分的子对象用一定的算法构成；由于需求的变化，
 * 这个复杂对象的各个部分经常面临着剧烈的变化，但是将它们组合在一起的算法却相对稳定
 * 应用实例： 1、去肯德基，汉堡、可乐、薯条、炸鸡翅等是不变的，而其组合是经常变化的，生成出所谓的"套餐"。
 *          2、JAVA 中的 StringBuilder
 * 优点： 1、建造者独立，易扩展。 2、便于控制细节风险。
 * 缺点： 1、产品必须有共同点，范围有限制。 2、如内部变化复杂，会有很多的建造类
 *
 * Director(指挥者): 用于构建一个使用Builder接口的对象。主要作用 1.隔离了客户与对象的生产过程; 2.负责控制产品对象的生产过程。
 * Builder(建造者): 声明了具体建造者的公共接口(产品的建造过程)&返回产品的方法
 * ConcreteBuilder(具体建造者): 实现Builder接口来创建具体产品
 * Product(具体产品): 即建造后的对象
 *
 * 实例：
 *  背景：小成希望去电脑城买一台组装的台式主机
 *  过程：1、电脑城老板（Diretor）和小成（Client）进行需求沟通（买来打游戏？学习？看片？）
 *       2、了解需求后，电脑城老板将小成需要的主机划分为各个部件（Builder）的建造请求（CPU、主板blabla）
 *       3、指挥装机人员（ConcreteBuilder）去构建组件
 *       4、将组件组装起来成小成需要的电脑（Product）
 */


public class MainAction {
    public static void main(String[] args) {
        //逛了很久终于发现一家合适的电脑店
        //找到该店的老板和装机人员
        Director director = new Director();
        Builder builder = new ConcreteBuilder();
        //沟通需求后，老板叫装机人员去装电脑
        director.Construct(builder);  //客户具体需求
        Computer computer = builder.getComputer();
        computer.show();
    }
}

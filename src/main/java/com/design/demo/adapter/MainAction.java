package com.design.demo.adapter;

/**
 * 适配器模式(结构型模式)  兼容
 * 主要解决：新旧接口不兼容问题
 * 应用实例： 1、美国电器 110V，中国 220V，就要有一个适配器将 110V 转化为 220V。
 *  2、JAVA JDK 1.1 提供了 Enumeration 接口，而在 1.2 中提供了 Iterator 接口，想要使用 1.2 的 JDK，
 *      则要将以前系统的 Enumeration 接口转化为 Iterator 接口，这时就需要适配器模式。
 *  3、在 LINUX 上运行 WINDOWS 程序。 4、JAVA 中的 jdbc
 *  优点： 1、可以让任何两个没有关联的类一起运行。 2、提高了类的复用。 3、增加了类的透明度。 4、灵活性好
 *  缺点： 1、过多地使用适配器，会让系统非常零乱，不易整体进行把握。比如，明明看到调用的是 A 接口，其实内部被适配成了 B 接口的实现，
 *      一个系统如果太多出现这种情况，无异于一场灾难。因此如果不是很有必要，可以不使用适配器，而是直接对系统进行重构。
 *  2.由于 JAVA 至多继承一个类，所以至多只能适配一个适配者类，而且目标类必须是抽象类
 *
 *  实例：
 *      小成买了一个进口的电视机，需要110V的电压，而国内电压是220V，需要做一次转换
 */
public class MainAction {

    public static void main(String[] args) {
        TargetVoltage targetVoltage = new AdapterVoltage();
        targetVoltage.convert110V();
    }
}

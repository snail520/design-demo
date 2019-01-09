package com.design.demo.Strategy;

/**
 * 策略模式(行为型模式)
 * 主要解决：在有多种算法相似的情况下，使用 if...else 所带来的复杂和难以维护
 * 应用实例： 1、诸葛亮的锦囊妙计，每一个锦囊就是一个策略。
 *      2、旅行的出游方式，选择骑自行车、坐汽车，每一种旅行方式都是一个策略。
 *      3、JAVA AWT 中的 LayoutManager
 * 优点： 1、算法可以自由切换。 2、避免使用多重条件判断。 3、扩展性良好。
 * 缺点： 1、策略类会增多。 2、所有策略类都需要对外暴露。
 *
 * 注意事项：如果一个系统的策略多于四个，就需要考虑使用混合模式，解决策略类膨胀的问题
 * 示例：
 *    小成有一家百货公司，最近在定年度的促销活动，针对不同节目使用不同促销活动进行促销
 */
public class MainAction {

    public static void main(String[] args) {
        Context_SalesMan salesMan;
        //春节来了，向客户展示A活动
        salesMan = new Context_SalesMan("A");
        salesMan.SalesManShow();

        //中秋节来了，向客户展示B活动
        salesMan = new Context_SalesMan("B");
        salesMan.SalesManShow();

        //圣诞节来了，向客户展示C活动
        salesMan = new Context_SalesMan("C");
        salesMan.SalesManShow();
    }
}

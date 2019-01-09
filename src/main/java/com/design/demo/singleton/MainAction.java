package com.design.demo.singleton;

/**
 * 单例模式(创建型模式) 重复创建
 * 主要解决：一个全局使用的类频繁地创建与销毁
 * 应用实例： 1、一个党只能有一个书记。
 *      2、Windows 是多进程多线程的，在操作一个文件的时候，就不可避免地出现多个进程或线程同时操作一个文件的现象，所以所有文件的处理必须通过唯一的实例来进行。
 *      3、一些设备管理器常常设计为单例模式，比如一个电脑有两台打印机，在输出的时候就要处理不能两台打印机打印同一个文件
 * 优点：1、在内存里只有一个实例，减少了内存的开销，尤其是频繁的创建和销毁实例（比如管理学院首页页面缓存）。
 *      2、避免对资源的多重占用（比如写文件操作）
 * 缺点：没有接口，不能继承，与单一职责原则冲突，一个类应该只关心内部逻辑，而不关心外面怎么样来实例化
 * 经验之谈：一般情况下，不建议使用第 1 种和第 2 种懒汉方式，建议使用第 3 种饿汉方式。只有在要明确实现 lazy loading 效果时，才会使用第 5 种登记方式。
 * 如果涉及到反序列化创建对象时，可以尝试使用第 6 种枚举方式。如果有其他特殊的需求，可以考虑使用第 4 种双检锁方式
 */


public class MainAction {

    public static void main(String[] args) {
        //1 懒汉式，线程不安全
        Singleton1 instance1 = Singleton1.getInstance();
        instance1.showMessage();
        //2 懒汉式，线程安全
        Singleton2 instance2 = Singleton2.getInstance();
        instance2.showMessage();
        //3 饿汉式,线程安全
        Singleton3 instance3 = new Singleton3();
        instance3.showMessage();
        //4 双检锁/双重校验锁（DCL，即 double-checked locking）
        Singleton4 instance4 = new Singleton4();
        instance4.showMessage();
        //5 登记式/静态内部类
        Singleton5 instance5 = Singleton5.getInstance();
        instance5.showMessage();
        //6 枚举
        Singleton6 instance6 = Singleton6.INSTANCE;
        instance6.showMessage();
    }
}

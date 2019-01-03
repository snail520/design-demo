package com.design.demo.singleton;

/**
 * 饿汉式
 * 是否 Lazy 初始化：否
 * 是否多线程安全：是
 * 描述：这种方式比较常用，但容易产生垃圾对象
 * 优点：没有加锁，执行效率会提高
 * 缺点：类加载时就初始化，浪费内存
 */
public class Singleton3 {

    private static Singleton3 instance = new Singleton3();

    public Singleton3 getInstance(){
        return instance;
    }

    public void showMessage(){
        System.out.println("Singleton3 !");
    }
}

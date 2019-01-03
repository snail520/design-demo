package com.design.demo.singleton;

/**
 * 双检锁/双重校验锁（DCL，即 double-checked locking）
 * 是否 Lazy 初始化：是
 * 是否多线程安全：是
 * 描述：这种方式采用双锁机制，安全且在多线程情况下能保持高性能
 */


public class Singleton4 {
    private volatile static Singleton4 instance;

    public static Singleton4 getInstance(){
        if(instance == null){
            synchronized (Singleton4.class){
                if(instance == null){
                    instance = new Singleton4();
                }
            }
        }
        return instance;
    }

    public void showMessage(){
        System.out.println("Singleton4 !");
    }
}

package com.itxiaoer.singleton;

/**
 * 饿汉式
 */
public class Singleton {
    private static final Singleton instance = new Singleton();

    private Singleton() {
    }

    public static Singleton getInstance() {
        return instance;
    }


}

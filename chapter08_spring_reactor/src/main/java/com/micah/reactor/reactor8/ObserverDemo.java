package com.micah.reactor.reactor8;

import java.util.Observable;

/**
 * @Author m.kong
 * @Date 2021/3/1 下午11:00
 * @Version 1.0
 */
public class ObserverDemo extends Observable {
    public static void main(String[] args) {
        ObserverDemo obServer = new ObserverDemo();
        // 添加观察者
        obServer.addObserver((o, arg) -> System.out.println("发生了变化..."));
        obServer.addObserver((o, arg) -> System.out.println("收到被观察者通知，准备改变"));
        obServer.setChanged(); // 数据发生变化
        obServer.notifyObservers(); // 通知观察者
    }
}

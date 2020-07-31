package org.example;
/**
 * 观察者（订阅者）
 * */
public interface Observer {
    //目标对象发生改变的时候通知观察者做出相应的改变
    void update(Subject subject);
}

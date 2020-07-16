package org.example;

/**
 * 装饰模式-桥接模式 结合使用
 * 装饰模式本质：动态的给类加功能
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        //用手机发送一个特殊的特别消息
        MessageType message = new NormalMessageTypeImpl("这是一个测试消息");
        MessageType urgencyMessage = new UrgencyMessageTypeDecorator(message);
        MessageType superUrgencyMessage = new SuperUrgencyMessageTypeDecorator(urgencyMessage);
        MessageType specialMessage = new SpecialMessageTypeDecorator(superUrgencyMessage);
        MessageMode mode = new MobileMessageModeImpl(specialMessage);
        mode.send();
    }
}

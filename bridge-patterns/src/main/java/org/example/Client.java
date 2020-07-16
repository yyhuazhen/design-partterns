package org.example;

/**
 * 桥接模式本质：分离抽象和实现
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        //用手机发送一个特殊的消息
        MessageMode messageMode = new MobileMessageModeImpl();
        MessageType messageType = new SpecialMessageTypeImpl(messageMode);
        messageType.message("这是一个测试消息");
    }
}

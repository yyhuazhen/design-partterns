package org.example;

public class MobileMessageModeImpl implements MessageMode {
    @Override
    public void send(String msg) {
        System.out.println("手机短信发送消息" + msg);
    }
}

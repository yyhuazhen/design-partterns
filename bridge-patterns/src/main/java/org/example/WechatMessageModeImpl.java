package org.example;

public class WechatMessageModeImpl implements MessageMode {
    @Override
    public void send(String msg) {
        System.out.println("微信发送消息:" + msg);
    }
}

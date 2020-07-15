package org.example;

public class EmailMessageModeImpl implements MessageMode {

    @Override
    public void send(String msg) {
        System.out.println("邮箱发送消息：" + msg);
    }
}

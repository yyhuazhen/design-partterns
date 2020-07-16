package org.example;

public class NormalMessageTypeImpl implements MessageType {
    private final String message;

    public NormalMessageTypeImpl(String message) {
        this.message = message;
    }

    @Override
    public String message() {
        return "这是一个正常的消息：" + message;
    }
}

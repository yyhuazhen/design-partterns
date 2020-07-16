package org.example;

public class SuperUrgencyMessageTypeDecorator extends MessageTypeDecorator {
    public SuperUrgencyMessageTypeDecorator(MessageType messageType) {
        super(messageType);
    }

    @Override
    public String message() {
        String msg = super.message();
        return "超级紧急消息:" + msg;
    }
}

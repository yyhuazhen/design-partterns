package org.example;

public class UrgencyMessageTypeDecorator extends MessageTypeDecorator {

    public UrgencyMessageTypeDecorator(MessageType messageType) {
        super(messageType);
    }

    @Override
    public String message() {
        String msg = super.message();
        return "紧急消息:" + msg;
    }
}

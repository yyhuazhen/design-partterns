package org.example;

public class SpecialMessageTypeDecorator extends MessageTypeDecorator {
    public SpecialMessageTypeDecorator(MessageType messageType) {
        super(messageType);
    }

    @Override
    public String message() {
        String msg = super.message();
        msg = "特殊消息:" + msg;
        return msg;
    }
}

package org.example;

public class UrgencyMessageTypeImpl implements MessageType {
    private MessageMode mode;

    public UrgencyMessageTypeImpl(MessageMode mode) {
        this.mode = mode;
    }

    @Override
    public void message(String message) {
        message = "紧急消息:" + message;
        mode.send(message);
    }
}

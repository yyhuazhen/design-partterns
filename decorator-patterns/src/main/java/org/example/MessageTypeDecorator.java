package org.example;

public abstract class MessageTypeDecorator implements MessageType {
    private final MessageType messageType;

    public MessageTypeDecorator(MessageType messageType) {
        this.messageType = messageType;
    }

    @Override
    public String message() {
        return messageType.message();
    }
}

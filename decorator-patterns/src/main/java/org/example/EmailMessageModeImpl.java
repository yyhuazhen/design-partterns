package org.example;

public class EmailMessageModeImpl implements MessageMode {
    private MessageType messageType;

    public EmailMessageModeImpl(MessageType messageType) {
        this.messageType = messageType;
    }

    @Override
    public void send() {
        String message = messageType.message();
        System.out.println("邮箱发送消息:" + message);
    }
}

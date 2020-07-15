package org.example;

public class SpecialMessageTypeImpl implements MessageType {
    private MessageMode mode;
    public SpecialMessageTypeImpl(MessageMode mode){
        this.mode = mode;
    }
    @Override
    public void message(String message) {
        message = "特殊消息:" + message;
        mode.send(message);
    }
}

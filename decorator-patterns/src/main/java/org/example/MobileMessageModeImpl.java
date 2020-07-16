package org.example;

import com.sun.org.apache.xml.internal.security.algorithms.MessageDigestAlgorithm;

public class MobileMessageModeImpl implements MessageMode {
    private MessageType messageType;
    public MobileMessageModeImpl(MessageType messageType){
        this.messageType = messageType;
    }
    @Override
    public void send() {
        String msg = messageType.message();
        System.out.println("手机短信发送消息:" + msg);
    }
}

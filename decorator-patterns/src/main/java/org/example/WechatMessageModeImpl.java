package org.example;

import com.sun.org.apache.xerces.internal.impl.XMLEntityScanner;

public class WechatMessageModeImpl implements MessageMode {
    private MessageType messageType;

    public WechatMessageModeImpl(MessageType messageType) {
        this.messageType = messageType;
    }

    @Override
    public void send() {
        String msg = messageType.message();
        System.out.println("微信发送消息:" + msg);
    }
}

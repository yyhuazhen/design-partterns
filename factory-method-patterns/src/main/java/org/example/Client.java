package org.example;

import org.example.factory.ExportFileCreater;
import org.example.factory.impl.ExportFileCreaterIpml;

/**
 * Hello world!
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        ExportFileCreater fatory = new ExportFileCreaterIpml();
        fatory.exprot("");
        System.out.println("通过工厂方法模式完成导出数据任务");
    }
}

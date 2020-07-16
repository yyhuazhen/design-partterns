package org.example;

/**
 * Hello world!
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        //抽象工厂：针对产品簇的一系列问题给出的解决方案  当只有一个产品的时候可以退化为工厂方法模式，当有多个产品时就使用抽象工厂模式能较好解决
        //缺点：当产品中新增某一功能的时候就得修改抽象工厂  可以用别的方法替代 但是存在风险，所以在使用的时候根据实际情况使用 防止过度使用
        ComputerEngineer engineer = new ComputerEngineer();
//        engineer.makeComputer("A");
        engineer.makeComputer("B");
        System.out.println("通过抽象工厂方法完成计算");
    }
}

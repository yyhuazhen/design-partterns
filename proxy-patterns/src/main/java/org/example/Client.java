package org.example;

import jdk.nashorn.internal.runtime.regexp.joni.Regex;
import org.example.dynamic.DynamicOrderProxy;
import org.example.dynamic.OrderApi;
import org.example.dynamic.OrderApiImpl;
import org.example.staticproxy.model1.FoodProxy;
import org.example.staticproxy.model1.NoodleFood;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Client {
    public static void main(String[] args) {
        //代理模式的本质:控制对象
        System.out.println("Start Task");
        NoodleFood food = new NoodleFood();
        FoodProxy proxy = new FoodProxy(food);
        proxy.makeFood();
        System.out.println("食物名字为:" + food.getFoodName());
//        String regx = "(\\d+).*";
//        String str = "MSC0006MSF007";
//        Pattern pattern = Pattern.compile(regx);
//        Matcher matcher = pattern.matcher(str);
//        if(matcher.find()){
//            String group = matcher.group(1);
//            System.out.println(group);
//        }
//        boolean matches = str.matches(regx);
        OrderApiImpl order = new OrderApiImpl("动态代理模式", 100, "张三");
        OrderApiImpl order1 = new OrderApiImpl("动态代理模式", 120, "赵四");
        DynamicOrderProxy dynamicProxy = new DynamicOrderProxy();
        OrderApi proxy1 = dynamicProxy.getProxy(order1);
        proxy1.setOrderUser("王五", "赵六");
        System.out.println( proxy1.getProductName()+proxy1.getProductName() + proxy1.getOrderNum());
    }
}

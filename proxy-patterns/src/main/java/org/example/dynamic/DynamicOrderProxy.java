package org.example.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DynamicOrderProxy implements InvocationHandler {
    private OrderApi order;

    //执行代理中的方法
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//        System.out.println(args.toString());
        if (method.getName().startsWith("set")) {
            if (order.getOrderUser() != null && order.getOrderUser().equals(args[1])) {
                Object invoke = method.invoke(order, args);
                return invoke;
            } else {
                System.out.println("您没有权限修改此订单");
            }
        } else {
            return method.invoke(order, args);
        }
        return null;
    }

    //绑定代理对象
    public OrderApi getProxy(OrderApiImpl order) {
        this.order = order;
        OrderApi orderApi = (OrderApi) Proxy.newProxyInstance(OrderApiImpl.class.getClassLoader(), OrderApiImpl.class.getInterfaces(), this);
        return orderApi;
    }
}

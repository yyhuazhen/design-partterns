package org.example;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * 模板方法模式本质：延迟加载
 */
public class Client {
    public static void main(String[] args) {
//        System.out.println("Hello World!");
//        //在数据库缓存中加点用户
//        init();
//        DbCache.printAll();
//        //普通用户登录
//        LoginTemplate normal = new NormalLoginTemplate();
//        String result = normal.login(new LoginModel("小王A", "xiaowangA", "1")) ? "登录成功" : "登录失败转到首页";
//        System.out.println(result);
//        LoginTemplate worker = new WorkerLoginTemplate();
//        LoginModel user = DbCache.getUser("4");
//        System.out.println(user.toString());
//        result = worker.login(new LoginModel("小明A", "xiaomingA", "4")) ? "登录成功" : "登录失败转到首页";
//        System.out.println(result);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyyMMdd");
        String startDate="20200505";
        LocalDateTime localDateTime = LocalDate.parse(startDate, dtf).atStartOfDay();
        System.out.println(localDateTime);
        LocalDateTime current = LocalDateTime.now();
        LocalDateTime backDate = current.minusDays(11);
        localDateTime = localDateTime.isBefore(backDate) ? backDate : localDateTime;
        System.out.println(localDateTime);
    }

    private static void init() {
        LoginModel normalA = new LoginModel("小王A", "xiaowangA", "1");
        LoginModel normalB = new LoginModel("小王B", "xiaowangB", "2");
        LoginModel normalC = new LoginModel("小王C", "xiaowangC", "3");
        LoginModel workerA = new LoginModel("小明A", "xiaomingA123", "4");
        LoginModel workerB = new LoginModel("小明B", "xiaomingB123", "5");
        LoginModel workerC = new LoginModel("小明C", "xiaomingC123", "6");
        DbCache.saveUser(normalA);
        DbCache.saveUser(normalB);
        DbCache.saveUser(normalC);
        DbCache.saveUser(workerA);
        DbCache.saveUser(workerB);
        DbCache.saveUser(workerC);
    }

    public static void test() {
        System.out.println("1".hashCode());
        System.out.println("2".hashCode());
        System.out.println("3".hashCode());
    }
}

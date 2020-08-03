package org.example;

public class FallBackClient {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        //在数据库缓存中加点用户
        init();
        DbCache.printAll();
        //普通用户登录
        LoginModel normal = new LoginModel("小王A", "xiaowangA", "1");
        FallBackLoginTemplate lt = new FallBackLoginTemplate();
        boolean flag = lt.login(normal, new FallBack() {
            @Override
            public LoginModel findLoginUser(String userId) {
                return DbCache.getUser(userId);
            }

            @Override
            public String encryptPwd(String pwd) {
                return pwd;
            }

            @Override
            public boolean match(LoginModel lm, LoginModel dblm, FallBackLoginTemplate fblt) {
                return fblt.match(lm, dblm);
            }
        });

        System.out.println("普通用户登录" + flag);
        LoginModel worker = new LoginModel("小明A", "xiaomingA", "4");
        boolean flag1 = lt.login(worker, new FallBack() {
            @Override
            public LoginModel findLoginUser(String userId) {
                return DbCache.getUser(userId);
            }

            @Override
            public String encryptPwd(String pwd) {
                return pwd + "123";
            }

            @Override
            public boolean match(LoginModel lm, LoginModel dblm, FallBackLoginTemplate fblt) {
                return fblt.match(lm, dblm);
            }
        });

        System.out.println("员工登录" + flag1);
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

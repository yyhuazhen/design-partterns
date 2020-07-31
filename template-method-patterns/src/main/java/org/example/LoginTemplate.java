package org.example;

/**
 * 模板对象，相当于框架
 */

public interface LoginTemplate {
    boolean login(LoginModel loginModel);

    LoginModel findLoginUser(String userId);

    String encryptPwd(String pwd);

    boolean match(LoginModel lm, LoginModel dblm);
}

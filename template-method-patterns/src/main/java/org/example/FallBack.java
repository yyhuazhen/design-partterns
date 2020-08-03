package org.example;

public interface FallBack {
    LoginModel findLoginUser(String userId);

    String encryptPwd(String pwd);

    boolean match(LoginModel lm,LoginModel dblm, FallBackLoginTemplate fblt);
}

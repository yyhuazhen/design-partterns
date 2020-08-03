package org.example;

public class FallBackLoginTemplate {
    public boolean login(LoginModel loginModel, FallBack fallBack) {
        LoginModel lgdb = findLoginUser(loginModel.getUserId());
        if (lgdb != null) {
            String encryptPwd = fallBack.encryptPwd(loginModel.getPassword());
            loginModel.setPassword(encryptPwd);
            return fallBack.match(loginModel, lgdb, this);
        }
        return false;
    }

    public LoginModel findLoginUser(String userId) {
        LoginModel user = DbCache.getUser(userId);
        return user;
    }

    public String encryptPwd(String pwd) {
        return pwd;
    }

    public boolean match(LoginModel lm, LoginModel dblm) {
        return lm.getUserId().equals(dblm.getUserId()) && lm.getPassword().equals(dblm.getPassword()) && dblm.getUserName().equals(dblm.getUserName());
    }
}

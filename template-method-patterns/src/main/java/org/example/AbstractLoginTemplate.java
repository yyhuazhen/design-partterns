package org.example;

public abstract class AbstractLoginTemplate implements LoginTemplate {
    @Override
    public boolean login(LoginModel loginModel) {
        LoginModel lgdb = findLoginUser(loginModel.getUserId());
        if (lgdb != null) {
            return this.match(loginModel, lgdb);
        }
        return false;
    }

    @Override
    public LoginModel findLoginUser(String userId) {
        return DbCache.getUser(userId);
    }

    @Override
    public String encryptPwd(String pwd) {
        throw new UnsupportedOperationException("不支持加密操作");
    }

    @Override
    public boolean match(LoginModel lm, LoginModel dblm) {
        throw new UnsupportedOperationException("不支持匹配操作");
    }
}

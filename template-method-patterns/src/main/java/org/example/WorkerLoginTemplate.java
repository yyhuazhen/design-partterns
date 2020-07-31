package org.example;

public class WorkerLoginTemplate extends AbstractLoginTemplate {
    @Override
    public String encryptPwd(String pwd) {
        return pwd + "123";
    }

    @Override
    public boolean match(LoginModel lm, LoginModel dblm) {
        String encryptPwd = encryptPwd(lm.getPassword());
        return lm.getUserId().equals(dblm.getUserId()) && encryptPwd.equals(dblm.getPassword()) && dblm.getUserName().equals(dblm.getUserName());
    }
}

package org.example;

public class NormalLoginTemplate extends AbstractLoginTemplate {
    @Override
    public boolean match(LoginModel lm, LoginModel dblm) {
        return lm.getUserId().equals(dblm.getUserId()) && lm.getPassword().equals(dblm.getPassword()) && lm.getUserName().equals(dblm.getUserName());
    }
}

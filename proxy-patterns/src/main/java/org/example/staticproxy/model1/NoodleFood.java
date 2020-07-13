package org.example.staticproxy.model1;

public class NoodleFood implements Food {
    @Override
    public void makeFood() {
        System.out.println("这是面条");
    }

    @Override
    public String getFoodName() {
        return "面条";
    }
}

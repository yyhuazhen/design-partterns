package org.example.staticproxy.model1;

public class FoodProxy implements Food {
    private Food food;

    public FoodProxy(Food food){
        this.food = food;
    }

    @Override
    public void makeFood() {
        food.makeFood();
    }

    @Override
    public String getFoodName() {
        return food.getFoodName();
    }
}

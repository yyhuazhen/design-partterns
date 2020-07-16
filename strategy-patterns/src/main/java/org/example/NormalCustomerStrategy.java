package org.example;

public class NormalCustomerStrategy implements Strategy {
    @Override
    public double calculate(double price) {
        return price;
    }
}

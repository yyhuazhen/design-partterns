package org.example;

public class LargestCustomerStrategy implements Strategy {
    @Override
    public double calculate(double price) {
        return 0.7 * price;
    }
}

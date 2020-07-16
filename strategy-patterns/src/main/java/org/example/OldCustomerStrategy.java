package org.example;

public class OldCustomerStrategy implements Strategy {
    @Override
    public double calculate(double price) {
        //老用户打8.5折
        return 0.85 * price;
    }
}

package org.example;

public class Content {
    private Strategy strategy;

    public Content(Strategy strategy) {
        this.strategy = strategy;
    }

    public double quote(double price) {
        return strategy.calculate(price);
    }
}

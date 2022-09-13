package ru.job4j.oop.inheritance.new22;

public class PizzaExtraCheeseExtraTomato extends PizzaExtraCheese {
    @Override
    public String name() {
        return super.name() + "  Jextra tomato!";
    }
}

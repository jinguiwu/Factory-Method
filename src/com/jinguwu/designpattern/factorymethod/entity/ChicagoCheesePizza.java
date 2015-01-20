package com.jinguwu.designpattern.factorymethod.entity;

/**
 * Created by jinguwu on 2015/1/10.
 */
public class ChicagoCheesePizza extends Pizza {
    public ChicagoCheesePizza() {
        name = "Chicago Cheese pizza.";
        dough = "Chicago dough.";
        sauce = "Chicago sauce.";
    }

    @Override
    public void cut() {
        System.out.println("cut into square pieces!");
    }
}

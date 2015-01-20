package com.jinguwu.designpattern.factorymethod.entity;

/**
 * Created by jinguwu on 2015/1/10.
 */
public class ChicagoMuliPizza extends Pizza {
    public ChicagoMuliPizza() {
        name = "Chicago Muli Pizza.";
        dough = "Chicago dough.";
        sauce = "Chicago sauce.";
    }

    @Override
    public void cut() {
        System.out.println("cut into square pieces!");
    }
}

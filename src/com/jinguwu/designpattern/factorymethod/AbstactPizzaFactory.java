package com.jinguwu.designpattern.factorymethod;

import com.jinguwu.designpattern.factorymethod.entity.Pizza;

/**
 * Created by jinguwu on 2015/1/10.
 */
public abstract class AbstactPizzaFactory {
    public Pizza orderPizza(String type){
        Pizza pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    public abstract Pizza createPizza(String type);
}

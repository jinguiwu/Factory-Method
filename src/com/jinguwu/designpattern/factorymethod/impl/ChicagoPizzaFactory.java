package com.jinguwu.designpattern.factorymethod.impl;

import com.jinguwu.designpattern.factorymethod.AbstactPizzaFactory;
import com.jinguwu.designpattern.factorymethod.entity.ChicagoCheesePizza;
import com.jinguwu.designpattern.factorymethod.entity.ChicagoMuliPizza;
import com.jinguwu.designpattern.factorymethod.entity.Pizza;

/**
 * Created by jinguwu on 2015/1/10.
 */
public class ChicagoPizzaFactory extends AbstactPizzaFactory {
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if(type.equalsIgnoreCase("cheese")){
            pizza = new ChicagoCheesePizza();
        }else if(type.equalsIgnoreCase("muli")){
            pizza = new ChicagoMuliPizza();
        }else {
            pizza = null;
        }
        return pizza;
    }
}

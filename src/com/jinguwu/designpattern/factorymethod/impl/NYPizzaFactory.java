package com.jinguwu.designpattern.factorymethod.impl;

import com.jinguwu.designpattern.factorymethod.AbstactPizzaFactory;
import com.jinguwu.designpattern.factorymethod.entity.NYCheesePizza;
import com.jinguwu.designpattern.factorymethod.entity.NYMuliPizza;
import com.jinguwu.designpattern.factorymethod.entity.Pizza;

/**
 * Created by jinguwu on 2015/1/10.
 */
public class NYPizzaFactory extends AbstactPizzaFactory {
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equals("cheese")){
            pizza = new NYCheesePizza();
        }else if(type.equalsIgnoreCase("MULI")){
            pizza = new NYMuliPizza();
        }else {
            pizza = null; // opening soon...
        }
        return pizza;
    }
}

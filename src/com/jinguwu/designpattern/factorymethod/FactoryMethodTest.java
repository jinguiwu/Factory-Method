package com.jinguwu.designpattern.factorymethod;

import com.jinguwu.designpattern.factorymethod.entity.Pizza;
import com.jinguwu.designpattern.factorymethod.impl.ChicagoPizzaFactory;
import com.jinguwu.designpattern.factorymethod.impl.NYPizzaFactory;

/**
 * Created by jinguwu on 2015/1/10.
 */
public class FactoryMethodTest {
    public static void main(String[] args){
        AbstactPizzaFactory abstactPizzaFactory = new NYPizzaFactory();
        Pizza pizza = abstactPizzaFactory.orderPizza("cheese");
        System.out.println("ordered a " + pizza.getName() + "pizza");
        pizza = abstactPizzaFactory.orderPizza("MULI");
        System.out.println("ordered a " + pizza.getName() + "pizza");
        abstactPizzaFactory = new ChicagoPizzaFactory();
        pizza = abstactPizzaFactory.orderPizza("cheese");
        System.out.println("ordered a " + pizza.getName() + "pizza");
        pizza = abstactPizzaFactory.orderPizza("muli");
        System.out.println("ordered a " + pizza.getName() + "pizza");
    }
}

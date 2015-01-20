package com.jinguwu.designpattern.factorymethod.entity;

/**
 * Created by jinguwu on 2015/1/10.
 */
public abstract class Pizza {
    String name;
    String sauce;
    String dough;
    public void bake() {
        System.out.println("bake in 350 c");
    }

    public void cut() {
        System.out.println("cut into circle pieces.");
    }

    public void box() {
        System.out.println("box for delivery..");
    }

    public void prepare() {
        System.out.println("1. roumian");
        System.out.println("1. add condiment");
    }

    public String getName() {
        return name;
    }
}

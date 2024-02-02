package com.example.discoutns;

import com.example.basket.BasketNode;

public abstract class ProductDiscount {
    private final Integer priority = 5;

    public Integer getPriority(){
        return this.priority;
    }
    public abstract void setPirceWithDiscount(BasketNode basketNode);
}

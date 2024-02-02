package com.example.discoutns;

import com.example.basket.BasketNode;

public interface Discount {
    public Integer getPriority();
    public Float setPirceWithDiscount(BasketNode basketNode);
}

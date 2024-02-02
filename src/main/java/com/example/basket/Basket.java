package com.example.basket;

import java.util.ArrayList;
import java.util.List;

public class Basket implements BasketNode{

    public List<Position> positions = new ArrayList<>();
    public Float discountPrice;

    @Override
    public Float getBasePrice() {
        Float sum = 0f;
        for(Position position : positions){
            sum += position.getBasePrice();
        }
        return sum;
    } 

    @Override
    public void setDiscountPrice(Float price) {
        this.discountPrice = price;
    }

    @Override
    public Float getDiscountPrice() {
        return this.discountPrice;
    }
    
}

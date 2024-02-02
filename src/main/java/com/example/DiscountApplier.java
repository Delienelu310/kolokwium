package com.example;

import java.util.ArrayList;
import java.util.List;

import com.example.basket.BasketNode;
import com.example.discoutns.Discount;

public class DiscountApplier {

    // list that is sorted by priority
    public List<Discount> discounts = new ArrayList<>();

    public void removeDiscount(Discount Discount){

    }

    public void addDiscount(Discount Discount){
        //add discount saving the priority sort
    } 

    public void setDiscountPrice(BasketNode basketNode){
        for(Discount discount : this.discounts){
            discount.setPirceWithDiscount(basketNode);
        }
    }
}

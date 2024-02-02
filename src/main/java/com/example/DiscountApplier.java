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


    // Algorithm used:
    //1. Divide list of discounts on different lists based on their priority (bigger priority ALWAYS goes first)
    //1.2 Optimisation - remove discount that do not influence the price
    //2. Change the lists order to change the prices (we can use dynamic programming for this task for example)
    //3. Choose the biggest/lowest price
    public void setDiscountPriceBiggest(BasketNode basketNode){

    }

    public void setDiscountPriceLowest(BasketNode basketNode){

    }
}

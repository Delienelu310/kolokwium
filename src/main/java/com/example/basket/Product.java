package com.example.basket;

public class Product implements BasketNode{

    public Integer id;
    public Float basePrice;
    public Float discountPrice;

    @Override
    public Float getBasePrice() {
        return this.basePrice;
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

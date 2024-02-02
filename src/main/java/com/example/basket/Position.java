package com.example.basket;

public class Position implements BasketNode{

    public Integer quantity;
    public Product product;
    public Float discountPrice;

    @Override
    public Float getBasePrice() {
        return this.product.getBasePrice() * this.quantity;
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

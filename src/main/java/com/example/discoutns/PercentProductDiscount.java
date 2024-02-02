package com.example.discoutns;

import com.example.basket.Basket;
import com.example.basket.BasketNode;
import com.example.basket.Position;
import com.example.basket.Product;

public class PercentProductDiscount extends ProductDiscount{

    public Integer productId;
    public Float percent;

    @Override
    public void setPirceWithDiscount(BasketNode basketNode) {
        if( !(basketNode instanceof Basket) ){
            throw new RuntimeException("Invalid input");
        }

        Basket basket = (Basket)basketNode;
        for(Position position : basket.positions){
            Product product = position.product;
            if(product.id != productId) continue;

            if(product.getDiscountPrice() == null) product.setDiscountPrice(product.getBasePrice());

            product.setDiscountPrice(product.getDiscountPrice() - product.getBasePrice() * percent);
        }
    }
    
}

package com.ilp.services;

import com.ilp.interfaces.CartOperations;

public class CartServices implements CartOperations {
    @Override
    public void addToCart(String product) {
        
        System.out.println(product + " added to cart.");
    }
}

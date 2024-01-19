package com.ilp.services;

import com.ilp.interfaces.WishlistOperations;

public class WishlistServices implements WishlistOperations {
    @Override
    public void addToWishlist(String product) {
        System.out.println(product + " added to wishlist.");
    }
}

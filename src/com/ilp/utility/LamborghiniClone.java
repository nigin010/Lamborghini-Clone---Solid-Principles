package com.ilp.utility;

import com.ilp.entity.Address;
import com.ilp.entity.AddressBook;
import com.ilp.interfaces.AddressRepository;
import com.ilp.interfaces.CartOperations;
import com.ilp.interfaces.WishlistOperations;
import com.ilp.services.AddressRepositoryServices;
import com.ilp.services.CartServices;
import com.ilp.services.WishlistServices;
import com.ilp.services.DeliveryAddress;
import com.ilp.services.InternationalAddress;

public class LamborghiniClone {
    public static void main(String[] args) {

        AddressRepository addressRepository = new AddressRepositoryServices();
        AddressBook addressBook = new AddressBook(addressRepository);

        Address internationalAddress = new InternationalAddress(
                "123 Main St", "City", "State", "12345", "US"
        );
        addressBook.addAddress(internationalAddress);

        Address deliveryAddress = new DeliveryAddress("456 Side St", "City", "State", "67890", "Leave at the door");
        addressBook.addAddress(deliveryAddress);

        for (Address address : addressBook.getAddresses()) {
            System.out.println(address.toString());
        }

        CartOperations cartUtility = new CartServices();
        cartUtility.addToCart("Lamborghini Keychain");

        WishlistOperations wishlistUtility = new WishlistServices();
        wishlistUtility.addToWishlist("Lamborghini T-shirt");

        if (deliveryAddress instanceof DeliveryAddress) {
            System.out.println("Delivery Instructions: " + ((DeliveryAddress) deliveryAddress).getDeliveryInstructions());
        } else {
            System.out.println("Not a Delivery Address");
        }
        
        Address anotherInternationalAddress = new InternationalAddress("Greenville", "City", "State", "54321", "UK");
        addressBook.addAddress(anotherInternationalAddress);

        System.out.println("\nAll Addresses:");
        for (Address address : addressBook.getAddresses()) {
            System.out.println(address.toString());
        }
    }
}

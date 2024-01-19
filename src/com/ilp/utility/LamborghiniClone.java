package com.ilp.utility;

import com.ilp.entity.Address;
import com.ilp.entity.AddressBook;
import com.ilp.interfaces.AddressRepository;
import com.ilp.interfaces.CartOperations;
import com.ilp.interfaces.WishlistOperations;
import com.ilp.services.AddressRepositoryServices;
import com.ilp.services.CartServices;
import com.ilp.services.DeliveryAddress;
import com.ilp.services.InternationalAddress;
import com.ilp.services.WishlistServices;

public class LamborghiniClone {

    public static void main(String[] args) {

        // Instantiate concrete implementations for dependencies
        AddressRepository addressRepository = new AddressRepositoryServices();
        CartOperations cartUtility = new CartServices();
        WishlistOperations wishlistUtility = new WishlistServices();

        // Create an AddressBook instance, injecting the AddressRepository
        AddressBook addressBook = new AddressBook(addressRepository);

        // Create InternationalAddress and DeliveryAddress instances
        Address internationalAddress = new InternationalAddress(
                "123 Main St", "City", "State", "12345", "US"
        );
        Address deliveryAddress = new DeliveryAddress("456 Side St", "City", "State", "67890", "Leave at the door");

        // Add addresses to the address book
        addressBook.addAddress(internationalAddress);
        addressBook.addAddress(deliveryAddress);

        // Print initial addresses
        for (Address address : addressBook.getAddresses()) {
            System.out.println(address.toString());
        }

        // Use cart and wishlist utilities
        cartUtility.addToCart("Lamborghini Keychain");
        wishlistUtility.addToWishlist("Lamborghini T-shirt");

        // Check for delivery instructions if applicable
        if (deliveryAddress instanceof DeliveryAddress) {
            System.out.println("Delivery Instructions: " + ((DeliveryAddress) deliveryAddress).getDeliveryInstructions());
        } else {
            System.out.println("Not a Delivery Address");
        }

        // Add another address
        Address anotherInternationalAddress = new InternationalAddress("Greenville", "City", "State", "54321", "UK");
        addressBook.addAddress(anotherInternationalAddress);

        // Print all addresses
        System.out.println("\nAll Addresses:");
        for (Address address : addressBook.getAddresses()) {
            System.out.println(address.toString());
        }
    }
}
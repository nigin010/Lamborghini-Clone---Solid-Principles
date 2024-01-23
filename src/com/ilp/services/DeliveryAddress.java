package com.ilp.services;

import com.ilp.entity.Address;

public class DeliveryAddress extends Address {
    @Override
	public String toString() {
		return "DeliveryAddress [deliveryInstructions=" + deliveryInstructions + "]";
	}

	private String deliveryInstructions;

    public DeliveryAddress(String street, String city, String state, String zipCode, String deliveryInstructions) {
        super(street, city, state, zipCode);
        this.deliveryInstructions = deliveryInstructions;
    }

    public String getDeliveryInstructions() {
        return deliveryInstructions;
    }

    public void setDeliveryInstructions(String deliveryInstructions) {
        this.deliveryInstructions = deliveryInstructions;
    }
}

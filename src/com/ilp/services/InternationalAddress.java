package com.ilp.services;

import com.ilp.entity.Address;

public class InternationalAddress extends Address {
    @Override
	public String toString() {
		return "InternationalAddress [countryCode=" + countryCode + "]";
	}

	private String countryCode;

    public InternationalAddress(String street, String city, String state, String zipCode, String countryCode) {
        super(street, city, state, zipCode);
        this.countryCode = countryCode;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    @Override
    public boolean validateAddress() {
        return super.validateAddress() && !countryCode.isEmpty();
    }
}
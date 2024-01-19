package com.ilp.entity;

public class Address {
    @Override
	public String toString() {
		return "Address [street=" + street + ", city=" + city + ", state=" + state + ", zipCode=" + zipCode + "]";
	}

	private String street;
    private String city;
    private String state;
    private String zipCode;

    public Address(String street, String city, String state, String zipCode) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    // Getters and setters:
    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public boolean validateAddress() {
        if (street.isEmpty() || city.isEmpty() || state.isEmpty() || zipCode.isEmpty()) {
            return false;
        }
        else
        {
        	return true;
        }
    }
}
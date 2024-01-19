package com.ilp.entity;

import com.ilp.interfaces.AddressRepository;

import java.util.List;

public class AddressBook {

    private final AddressRepository addressRepository;

    public AddressBook(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }

    public void addAddress(Address address) {
        addressRepository.addAddress(address);
    }

    public List<Address> getAddresses() {
        return addressRepository.getAllAddresses();
    }
}
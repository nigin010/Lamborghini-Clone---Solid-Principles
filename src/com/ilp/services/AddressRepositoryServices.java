package com.ilp.services;

import com.ilp.entity.Address;
import com.ilp.interfaces.AddressRepository;

import java.util.ArrayList;
import java.util.List;

public class AddressRepositoryServices implements AddressRepository {
    private List<Address> addresses;

    public AddressRepositoryServices() {
        this.addresses = new ArrayList<>();
    }

    @Override
    public void addAddress(Address address) {
        addresses.add(address);
    }

    @Override
    public List<Address> getAllAddresses() {
        return new ArrayList<>(addresses);
    }
}

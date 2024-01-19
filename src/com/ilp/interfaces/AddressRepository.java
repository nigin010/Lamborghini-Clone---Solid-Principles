package com.ilp.interfaces;

import java.util.List;

import com.ilp.entity.Address;

public interface AddressRepository {
    void addAddress(Address address);
    List<Address> getAllAddresses();
}

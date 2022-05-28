package com.ty.hospital.app.dao;

import com.ty.hospital.app.dto.Address;

public interface AddressDao {
	
	public Address saveAddress(Address address, int branch_id);
	public Address getBranchAddressById(int id);
	public Address updateAddress(Address address, int id);
	public boolean deleteAddress(int id);

}

package org.kk.jsonconversion.model;

import java.io.Serializable;

/**
 * Address details.
 * 
 * @author krishnakumar
 * 
 */
public class Address implements Serializable {

	private static final long serialVersionUID = -291393950554966155L;
	private String address1;
	private String street;
	private String state;
	private String pincode;

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public Address(final String address1, final String street, final String state,
			final String pinCode) {
		this.setAddress1(address1);
		this.setStreet(street);
		this.setState(state);
		this.setPincode(pinCode);
	}

}

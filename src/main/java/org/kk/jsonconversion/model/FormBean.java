package org.kk.jsonconversion.model;

import java.io.Serializable;

/**
 * Complex type model object.
 * 
 * @author krishnakumar
 * 
 */
public class FormBean implements Serializable {

	private static final long serialVersionUID = -5600189373922519204L;
	private StudentFormBean studentFormBean;
	private Address address;

	public StudentFormBean getStudentFormBean() {
		return studentFormBean;
	}

	public void setStudentFormBean(StudentFormBean studentFormBean) {
		this.studentFormBean = studentFormBean;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public FormBean(final StudentFormBean studentFormBean, final Address address) {
		this.setAddress(address);
		this.setStudentFormBean(studentFormBean);
	}
}

package org.kk.jsonconversion.model;

import java.io.Serializable;

/**
 * Student model class.
 * 
 * @author krishnakumar
 * 
 */
public class StudentFormBean implements Serializable {

	private static final long serialVersionUID = -4256927871832916527L;
	private String registerNumber;
	private String name;
	private int age;

	public String getRegisterNumber() {
		return registerNumber;
	}

	public void setRegisterNumber(String registerNumber) {
		this.registerNumber = registerNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public StudentFormBean() {
	}

	public StudentFormBean(final String registerNumber, final String name, final int age) {
		this.registerNumber = registerNumber;
		this.name = name;
		this.age = age;
	}

}

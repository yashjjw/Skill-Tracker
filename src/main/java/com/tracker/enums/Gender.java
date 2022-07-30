package com.tracker.enums;
public enum Gender {
	MALE("M"),
	
	FEMALE("F");
	
	private String value;

	/**
	 * Instantiates a new gender.
	 *
	 * @param value the value
	 */
	private Gender(String value) {
		this.value = value;
	}

	/**
	 * Gets the value.
	 *
	 * @return the value
	 */
	public String getValue() {
		return value;
	}
	
}

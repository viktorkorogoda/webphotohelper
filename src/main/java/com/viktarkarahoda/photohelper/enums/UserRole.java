package com.viktarkarahoda.photohelper.enums;

public enum UserRole {
	ROLE_ADMIN("Admin"), ROLE_WORKER("Worker"), ROLE_USER("ROLE_USER");

	private String value;

	private UserRole(String value) {
		this.value = value;
	}

	public static UserRole fromString(String value) {
		if (value != null) {
			for (UserRole b : UserRole.values()) {
				if (value.equalsIgnoreCase(b.value)) {
					return b;
				}
			}
		}
		return null;
	}

	@Override
	public String toString() {
		return value;
	}
}

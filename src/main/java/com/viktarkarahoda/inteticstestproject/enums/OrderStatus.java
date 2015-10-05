package com.viktarkarahoda.inteticstestproject.enums;

public enum OrderStatus {

	COMPLETED("Completed"), IN_PROGRESS("In Progress"), CANCELLED("Cancelled");

	private String value;

	private OrderStatus(String value) {
		this.value = value;
	}

	public static OrderStatus fromString(String value) {
		if (value != null) {
			for (OrderStatus b : OrderStatus.values()) {
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

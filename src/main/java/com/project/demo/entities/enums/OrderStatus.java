package com.project.demo.entities.enums;

public enum OrderStatus {
	ORDERED_PURCHASE(0),
	DELIVERED(1),
	CANCELED(2),
	WAITING_BUY_BACK(3),
	BUY_BACK_CONCLUDED(4);
	
	private int code;
	
	private OrderStatus(int code) {
		this.code = code;
	}
	
	public int getCode() {
		return code;
	}
	
	public static OrderStatus valueOf(int code) {
		for (OrderStatus value : OrderStatus.values()) {
			if (value.getCode() == code) {
				return value;
			}
		}
		throw new IllegalArgumentException("Invalid OrderStatus code");
	}
}



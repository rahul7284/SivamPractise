package com.prestige.test.model;

public class Cart implements java.io.Serializable {
	private Integer cartId;
	private String cartName;
	public Integer getCartId() {
		return cartId;
	}
	public void setCartId(Integer cartId) {
		this.cartId = cartId;
	}
	public String getCartName() {
		return cartName;
	}
	public void setCartName(String cartName) {
		this.cartName = cartName;
	}
}

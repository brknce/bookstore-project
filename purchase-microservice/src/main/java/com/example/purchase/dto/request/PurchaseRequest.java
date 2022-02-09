package com.example.purchase.dto.request;

import javax.validation.constraints.NotBlank;

public class PurchaseRequest {
	
	@NotBlank
	private String purchaseId;
	@NotBlank
	private double isbn;
	@NotBlank
	private double epurse;
	@NotBlank
	private double price;
	public String getPurchaseId() {
		return purchaseId;
	}
	public void setPurchaseId(String purchaseId) {
		this.purchaseId = purchaseId;
	}
	public double getIsbn() {
		return isbn;
	}
	public void setIsbn(double isbn) {
		this.isbn = isbn;
	}
	public double getEpurse() {
		return epurse;
	}
	public void setEpurse(double epurse) {
		this.epurse = epurse;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "PurchaseRequest [purchaseId=" + purchaseId + ", isbn=" + isbn + ", epurse=" + epurse + ", price="
				+ price + "]";
	}
}

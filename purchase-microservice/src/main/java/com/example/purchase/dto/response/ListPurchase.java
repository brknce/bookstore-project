package com.example.purchase.dto.response;

public class ListPurchase {

	private String PurchaseId;
	private String Purchase;
	public String getPurchaseId() {
		return PurchaseId;
	}
	public void setPurchaseId(String purchaseId) {
		PurchaseId = purchaseId;
	}
	public String getPurchase() {
		return Purchase;
	}
	public void setPurchase(String purchase) {
		Purchase = purchase;
	}
	@Override
	public String toString() {
		return "ListPurchase [PurchaseId=" + PurchaseId + ", Purchase=" + Purchase + "]";
	}
	
}

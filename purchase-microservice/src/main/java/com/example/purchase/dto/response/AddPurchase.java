package com.example.purchase.dto.response;

public class AddPurchase {
private String PurchaseId;
private String Price;
private String Epurse;
public String getPurchaseId() {
	return PurchaseId;
}
public void setPurchaseId(String purchaseId) {
	PurchaseId = purchaseId;
}
public String getPrice() {
	return Price;
}
public void setPrice(String price) {
	Price = price;
}
public String getEpurse() {
	return Epurse;
}
public void setEpurse(String epurse) {
	Epurse = epurse;
}
@Override
public String toString() {
	return "AddPurchase [PurchaseId=" + PurchaseId + ", Price=" + Price + ", Epurse=" + Epurse + "]";
}


}

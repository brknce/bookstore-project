package com.example.purchase.document;

import java.util.Objects;

import org.springframework.data.mongodb.core.mapping.Document;
@Document(collection = "purchase")
public class PurchaseDocument {

private String purchaseId;
private double isbn;
private double epurse;
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
public int hashCode() {
	return Objects.hash(purchaseId);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	PurchaseDocument other = (PurchaseDocument) obj;
	return Objects.equals(purchaseId, other.purchaseId);
}
@Override
public String toString() {
	return "PurchaseDocument [purchaseId=" + purchaseId + ", isbn=" + isbn + ", epurse=" + epurse + ", price=" + price
			+ "]";
}



}

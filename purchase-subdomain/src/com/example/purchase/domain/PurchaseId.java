package com.example.purchase.domain;

import java.util.Objects;

public class PurchaseId {
private final String value;

public PurchaseId(String value) {
	
	this.value = value;
}

public String getValue() {
	return value;
}
public static PurchaseId of(String value) {
	return new PurchaseId(value);
}

@Override
public int hashCode() {
	return Objects.hash(value);
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	PurchaseId other = (PurchaseId) obj;
	return Objects.equals(value, other.value);
}

@Override
public String toString() {
	return "PurchaseId [value=" + value + "]";
}

}

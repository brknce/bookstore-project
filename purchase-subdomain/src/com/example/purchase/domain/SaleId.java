package com.example.purchase.domain;

import java.util.Objects;

public class SaleId {
private final String value;

public SaleId(String value) {
	
	this.value = value;
}

public String getValue() {
	return value;
}
public static SaleId of(String value) {
	return new SaleId(value);
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
	SaleId other = (SaleId) obj;
	return Objects.equals(value, other.value);
}

@Override
public String toString() {
	return "SaleId [value=" + value + "]";
}

}

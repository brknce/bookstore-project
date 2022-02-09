package com.example.purchase.domain;

import java.util.Objects;

public class Purchase {
	private PurchaseId purchaseId;
	private ISBN isbn;
	private Epurse epurse;
	private Price price;

	public class Builder {

		private PurchaseId purchaseId;
		private ISBN isbn;
		private Epurse epurse;
		private Price price;

		public Builder isbn(String value) {
			this.isbn = ISBN.of(value);
			return this;
		}

		public Builder saleId(String value) {
			this.purchaseId = PurchaseId.of(value);
			return this;
		}

		@SuppressWarnings("static-access")
		public Builder price(double value) {
			this.price = price.of(value);
			return this;
		}

		@SuppressWarnings("static-access")
		public Builder Epurse(double value) {
			this.epurse = epurse.of(value);
			return this;
		}

		public Purchase build() {
			var purchase = new Purchase(this.isbn, this.purchaseId, this.epurse, this.price);
			return purchase;
		}
	}

	public Purchase(ISBN isbn, PurchaseId saleId, Epurse epurse, Price price) {
		this.isbn = isbn;
		this.purchaseId = saleId;
		this.epurse = epurse;
		this.price = price;

	}

	@Override
	public String toString() {
		return "Purchase [saleId=" + purchaseId + ", isbn=" + isbn + ", epurse=" + epurse + ", price=" + price + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(isbn);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Purchase other = (Purchase) obj;
		return Objects.equals(isbn, other.isbn);
	}

	public PurchaseId getSaleId() {
		return purchaseId;
	}

	public void setSaleId(PurchaseId purchaseId) {
		this.purchaseId = purchaseId;
	}

	public ISBN getIsbn() {
		return isbn;
	}

	public void setIsbn(ISBN isbn) {
		this.isbn = isbn;
	}

	public Epurse getEpurse() {
		return epurse;
	}

	public void setEpurse(Epurse epurse) {
		this.epurse = epurse;
	}

	public Price getPrice() {
		return price;
	}

	public void setPrice(Price price) {
		this.price = price;
	}

	public Object getPurchaseId() {
		// TODO Auto-generated method stub
		return null;
	}
}





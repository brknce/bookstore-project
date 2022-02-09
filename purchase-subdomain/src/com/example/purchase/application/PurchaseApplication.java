package com.example.purchase.application;

import java.util.List;
import java.util.Optional;

import com.example.purchase.domain.Purchase;
import com.example.purchase.domain.PurchaseId;

public interface PurchaseApplication {
	

List <Purchase> ListPurchase (Purchase purchase);
Optional<Purchase> findPurchaseByPurchaseId(PurchaseId PurchaseId);
Purchase addPurchase(Purchase purchase, int Price);	

	

}

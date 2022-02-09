package com.example.purchase.service;

import java.util.List;
import java.util.Optional;


public interface PurchaseService {

List <Purchase> ListPurchase (Purchase purchase);
Optional<Purchase> findPurchaseByPurchaseId(PurchaseId PurchaseId);
Purchase addPurchase(Purchase purchase, int Price);	

	

}



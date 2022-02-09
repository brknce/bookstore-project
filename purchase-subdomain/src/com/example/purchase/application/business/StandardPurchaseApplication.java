package com.example.purchase.application.business;

import java.util.List;
import java.util.Optional;

import com.example.order.application.business.events.OrderListByCategoryEvent;
import com.example.order.domain.Order;
import com.example.order.domain.OrderId;
import com.example.order.infrastructure.EventPublisher;
import com.example.order.repository.OrderRepository;
import com.example.purchase.application.PurchaseApplication;
import com.example.purchase.application.business.event.PurchaseListByCategoryEvent;
import com.example.purchase.domain.Epurse;
import com.example.purchase.domain.Price;
import com.example.purchase.domain.Purchase;
import com.example.purchase.domain.PurchaseId;
import com.example.purchase.infrastructure.EventPurchase;
import com.example.purchase.repository.PurchaseRepository;

public class StandardPurchaseApplication implements PurchaseApplication {
	private PurchaseRepository purchaseRepository;
    private	EventPublisher eventPublisher;
    
    public StandardPurchaseApplication(PurchaseRepository purchaseRepository, EventPublisher eventPublisher) {
		this.purchaseRepository = purchaseRepository;
		this.eventPublisher = eventPublisher;
	}

	@Override
	public Purchase addPurchase(Purchase purchase, int Price) {
		var purchaseId = purchase.getPurchaseId();
	
			
		
		return purchase;
		
	}
	@Override
	public List<Purchase> ListPurchase(Purchase purchase) {
		List<Purchase> orderList = purchaseRepository.findAllByPurchase(purchase);
		eventPublisher.publishEvent(new PurchaseListByCategoryEvent());
		return purchase;
	
	}
	@Override
	public Optional<Purchase> findPurchaseByPurchaseId(PurchaseId PurchaseId) {
		return purchaseRepository.findOneByPurchase(PurchaseId);
		
	}
	
}

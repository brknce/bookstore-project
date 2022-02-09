package com.example.purchase.service.business;

import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.example.purchase.application.business.event.PurchaseListByCategoryEvent;
import com.example.purchase.domain.Purchase;
import com.example.purchase.domain.PurchaseId;
import com.example.purchase.service.PurchaseService;


@Service
public class StandardHrService implements PurchaseService {

	private PurchaseApplication purchaseApplication;
	private ModelMapper modelMapper;
	
	public void StandardPurchaseService(PurchaseApplication hrApplication, ModelMapper modelMapper) {
		this.purchaseApplication = hrApplication;
		this.modelMapper = modelMapper;
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
	@Override
	public List<com.example.purchase.service.Purchase> ListPurchase(com.example.purchase.service.Purchase purchase) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Optional<com.example.purchase.service.Purchase> findPurchaseByPurchaseId(
			com.example.purchase.service.PurchaseId PurchaseId) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public com.example.purchase.service.Purchase addPurchase(com.example.purchase.service.Purchase purchase,
			int Price) {
		// TODO Auto-generated method stub
		return null;
	}
}

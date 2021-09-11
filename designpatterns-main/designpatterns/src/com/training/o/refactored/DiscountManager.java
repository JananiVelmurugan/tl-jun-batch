package com.training.o.refactored;
public class DiscountManager {

	void processBookDiscount(BookDiscount discount) {
		discount.getBookDiscount();
	}
	
	public static void main(String[] args) {
		DiscountManager discountManager = new DiscountManager();
		
		CookbookDiscount cookbookDiscount = new CookbookDiscount();
		discountManager.processBookDiscount(cookbookDiscount);
		
		BiographyDiscount biographyDiscount = new BiographyDiscount();
		discountManager.processBookDiscount(biographyDiscount);
		
		HistoryDiscount historyDiscount = new HistoryDiscount();
		discountManager.processBookDiscount(historyDiscount);
		
		
		
	}
}

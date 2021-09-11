package com.training.o.refactored;

public class HistoryDiscount implements BookDiscount{

	@Override
	public String getBookDiscount() {
		String discount = "56% on the History Books.";

		return discount;
		
	}

	
	
}

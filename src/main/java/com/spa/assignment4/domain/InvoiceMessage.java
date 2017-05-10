package com.spa.assignment4.domain;

public class InvoiceMessage {
	private Invoice invoice;
	
	public InvoiceMessage(Invoice invoice) {
		this.invoice = invoice;
	}
	
	public Invoice getInvoice() {
		return invoice;
	}
	
	@Override
	public String toString() {
		return invoice.toString();
	}
	
}

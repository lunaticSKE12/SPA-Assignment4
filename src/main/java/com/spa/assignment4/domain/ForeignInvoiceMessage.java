package com.spa.assignment4.domain;

public class ForeignInvoiceMessage extends InvoiceMessage {

	public ForeignInvoiceMessage(Invoice invoice) {
		super(invoice);
	}
	
	@Override
	public String toString() {
		return "Foreign"+super.toString();
	}
	
}

package com.spa.assignment4.domain;

public class LocalInvoiceMessage extends InvoiceMessage {

	public LocalInvoiceMessage(Invoice invoice) {
		super(invoice);
	}
	
	@Override
	public String toString() {
		return "Local"+super.toString();
	}
	
}

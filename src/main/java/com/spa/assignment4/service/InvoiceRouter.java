package com.spa.assignment4.service;

import org.apache.log4j.Logger;
import org.springframework.integration.annotation.MessageEndpoint;
import org.springframework.integration.annotation.Router;

import com.spa.assignment4.domain.Invoice;
import com.spa.assignment4.domain.Invoice.InvoiceType;

@MessageEndpoint
public class InvoiceRouter {
	
//	private static Logger logger = Logger.getLogger(InvoiceRouter.class);
	
	@Router(inputChannel="filteredInvoicesChannel")
	public String route(Invoice invoice) {
		if(invoice.getInvoiceType() == InvoiceType.CROSS_BORDER) {
			return "foreignTransactions";
		} else if(invoice.getInvoiceType() == InvoiceType.DOMESTIC) {
			return "localTransactions";
		}
		
		return "nullChannel";
	}
	
}

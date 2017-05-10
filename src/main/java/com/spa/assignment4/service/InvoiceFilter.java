package com.spa.assignment4.service;

import org.apache.log4j.Logger;
import org.springframework.integration.annotation.Filter;
import org.springframework.integration.annotation.MessageEndpoint;

import com.spa.assignment4.domain.Invoice;

@MessageEndpoint
public class InvoiceFilter {
	
//	private static Logger logger = Logger.getLogger(InvoiceFilter.class);
	private static final long INVOICE_AMOUNT_LIMIT = 10000;
	
	@Filter(inputChannel="singleInvoicesChannel", outputChannel="filteredInvoicesChannel", discardChannel="discardInvoicesChannel")
	public boolean filterInvoiceAmountExceeds(Invoice invoice) {
		boolean hasExceededAmount = invoice.getAmount() >= INVOICE_AMOUNT_LIMIT;
		if(!hasExceededAmount) {
//			logger.debug("Amount of "+invoice.getAmount()+" CAN be automatically processed by system.");
			System.out.println("Amount of "+invoice.getAmount()+" CAN be automatically processed by system.");
		}
		return !hasExceededAmount;
	}
	
}

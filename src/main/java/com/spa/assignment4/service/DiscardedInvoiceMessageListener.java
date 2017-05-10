package com.spa.assignment4.service;

import org.apache.log4j.Logger;
import org.springframework.integration.annotation.MessageEndpoint;
import org.springframework.integration.annotation.ServiceActivator;

import com.spa.assignment4.domain.Invoice;

@MessageEndpoint
public class DiscardedInvoiceMessageListener {
	
//	private final Logger logger = Logger.getLogger(DiscardedInvoiceMessageListener.class);
	
	@ServiceActivator(inputChannel="discardInvoicesChannel")
	public void discardInvoice(Invoice invoice) {
//		logger.debug("Amount of "+invoice.getAmount()+" CANNOT be automatically processed by system.");
		System.out.println("Amount of "+invoice.getAmount()+" CANNOT be automatically processed by system.");
	}
	
}

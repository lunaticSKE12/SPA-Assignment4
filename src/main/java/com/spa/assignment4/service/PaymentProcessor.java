package com.spa.assignment4.service;

import org.apache.log4j.Logger;
import org.springframework.integration.annotation.MessageEndpoint;
import org.springframework.integration.annotation.ServiceActivator;

import com.spa.assignment4.domain.InvoiceMessage;

@MessageEndpoint
public class PaymentProcessor {
	
//	private static Logger logger = Logger.getLogger(PaymentProcessor.class);
	
	@ServiceActivator(inputChannel="bankingChannel")
	public void processInvoice(InvoiceMessage invoiceMessage) {
		System.out.println("Processing " + invoiceMessage);
//		logger.debug();
	}
	
}

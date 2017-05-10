package com.spa.assignment4.service;

import org.apache.log4j.Logger;
import org.springframework.integration.annotation.MessageEndpoint;
import org.springframework.integration.annotation.Transformer;

import com.spa.assignment4.domain.ForeignInvoiceMessage;
import com.spa.assignment4.domain.Invoice;
import com.spa.assignment4.domain.LocalInvoiceMessage;

@MessageEndpoint
public class ForeignPaymentCreator {
	
//	private static Logger logger = Logger.getLogger(ForeignPaymentCreator.class);
	
	@Transformer(inputChannel="foreignTransactions", outputChannel="bankingChannel")
	public ForeignInvoiceMessage transformForeignInvoice(Invoice invoice) {
		return new ForeignInvoiceMessage(invoice);
	}
	
	@Transformer(inputChannel="localTransactions", outputChannel="bankingChannel")
	public LocalInvoiceMessage transformLocalInvoice(Invoice invoice) {
		return new LocalInvoiceMessage(invoice);
	}
	
}

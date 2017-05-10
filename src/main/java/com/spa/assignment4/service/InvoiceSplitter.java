package com.spa.assignment4.service;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.integration.annotation.MessageEndpoint;
import org.springframework.integration.annotation.Splitter;
import org.springframework.messaging.Message;

import com.spa.assignment4.domain.Invoice;

@MessageEndpoint
public class InvoiceSplitter {

//	private static final Logger logger = Logger.getLogger(InvoiceSplitter.class);
	
	@Splitter(inputChannel="newInvoicesChannel", outputChannel="singleInvoicesChannel")
	public List<Invoice> splitMessage(Message<List<Invoice>> message) {
		return message.getPayload();
	}
	
}

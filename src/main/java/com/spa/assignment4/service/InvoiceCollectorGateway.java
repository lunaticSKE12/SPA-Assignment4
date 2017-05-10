package com.spa.assignment4.service;

import java.util.List;

import org.springframework.integration.annotation.Gateway;
import org.springframework.integration.annotation.MessagingGateway;
import org.springframework.messaging.Message;

import com.spa.assignment4.domain.Invoice;

@MessagingGateway
public interface InvoiceCollectorGateway {
	
	@Gateway(requestChannel = "newInvoicesChannel")
	void collectInvoices(Message<List<Invoice>> inputInvoices);
}
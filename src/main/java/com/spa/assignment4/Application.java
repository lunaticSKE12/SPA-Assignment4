package com.spa.assignment4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.messaging.support.MessageBuilder;

import com.spa.assignment4.configuration.Config;
import com.spa.assignment4.domain.Invoice;
import com.spa.assignment4.domain.Invoice.InvoiceType;
import com.spa.assignment4.service.InvoiceCollectorGateway;

@SpringBootApplication
public class Application {

//	private static Logger logger = Logger.getLogger(Application.class);
	
	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);
		InvoiceCollectorGateway gateway = ctx.getBean(InvoiceCollectorGateway.class);
		gateway.collectInvoices(MessageBuilder.withPayload(createInvoices()).build());
		
		((AnnotationConfigApplicationContext) ctx).close();
	}
	
	private static List<Invoice> createInvoices() {
		List<Invoice> invoices = new ArrayList<Invoice>();
		
		invoices.add(new Invoice(InvoiceType.DOMESTIC, "current-local-acc", "test-account 9681000", 4706));
		invoices.add(new Invoice(InvoiceType.DOMESTIC, "current-local-acc", "test-account 5551000", 6531));
		invoices.add(new Invoice(InvoiceType.DOMESTIC, "current-local-acc", "test-account 9379135", 17083));
		invoices.add(new Invoice(InvoiceType.CROSS_BORDER, "current-iban-acc", "test-iban-2421000", 3601));
		invoices.add(new Invoice(InvoiceType.CROSS_BORDER, "current-iban-acc", "test-iban-2151059", 18761));
		invoices.add(new Invoice(InvoiceType.DOMESTIC, "current-local-acc", "test-account 2814014", 13286));
		invoices.add(new Invoice(InvoiceType.CROSS_BORDER, "current-iban-acc", "test-iban-9291000", 5765));
		invoices.add(new Invoice(InvoiceType.CROSS_BORDER, "current-iban-acc", "test-iban-4124989", 17192));
		invoices.add(new Invoice(InvoiceType.DOMESTIC, "current-local-acc", "test-account-2481040", 19139));
		invoices.add(new Invoice(InvoiceType.CROSS_BORDER, "current-iban-acc", "test-account-iban-7961000", 1699));
		
		return Collections.unmodifiableList(invoices);
	}
	
	
}
